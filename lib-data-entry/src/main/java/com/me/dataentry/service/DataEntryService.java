package com.me.dataentry.service;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.me.dataentry.dto.ProfileData;
import com.me.dataentry.dto.ProfileData.FieldData;

@Service
public class DataEntryService {

    @Autowired
    private WebClient webClient;

    private String fetchSpringProfileData(String profileName, boolean schema) {

        RequestHeadersSpec op = webClient.get().uri(builder -> {
            URI uri = builder.pathSegment("profile", profileName).build();
            return uri;
        });
        if (schema) {
            op.header(HttpHeaders.ACCEPT, "application/schema+json");
        }

        ResponseSpec response = op.retrieve();
        return response.bodyToMono(String.class).block();
    }

    public String fetchProfileData(String profileName) {
        String springProfileSchema = fetchSpringProfileData(profileName, true);
        JsonElement result = new Gson().fromJson(springProfileSchema, JsonElement.class);

        String springProfile = fetchSpringProfileData(profileName, false);
        JsonElement springProfileJson = new Gson().fromJson(springProfile, JsonElement.class);
        JsonArray descriptorArr = springProfileJson.getAsJsonObject().getAsJsonObject("alps")
                .getAsJsonArray("descriptor");
        ProfileData profileData = new ProfileData();
        Map<String, FieldData> fieldData = new HashMap<>();

        descriptorArr.forEach(des -> {
            JsonObject obj = des.getAsJsonObject();
            String id = obj.getAsJsonPrimitive("id").getAsString();
            if (id.contains("representation")) {
                JsonArray fields = obj.getAsJsonArray("descriptor");
                fields.forEach(field -> {
                    JsonObject fieldObj = field.getAsJsonObject();
                    String entityName = null;
                    if (fieldObj.get("rt") != null) {
                        String representationUrl = fieldObj.getAsJsonPrimitive("rt").getAsString();
                        int start = representationUrl.lastIndexOf("/");
                        int end = representationUrl.lastIndexOf("#");
                        entityName = representationUrl.substring(start + 1, end);
                    }
                    FieldData data = new FieldData(fieldObj.getAsJsonPrimitive("name").getAsString(),
                            fieldObj.getAsJsonPrimitive("type").getAsString(), entityName);
                    fieldData.put(data.getName(), data);
                });
            }
        });
        profileData.setFields(fieldData);
        JsonElement profileDataGsonOBj = new Gson().toJsonTree(profileData);
        result.getAsJsonObject().add("me_profile_data", profileDataGsonOBj);
        return result.toString();
    }

}
