package com.me.dataentry.dto;

import java.util.Map;

public class ProfileData {

    public Map<String, FieldData> fields;

    public static class FieldData {

        String name;
        String type;
        String entityNameForRead;

        public FieldData(String name, String type, String getEntityName) {
            super();
            this.name = name;
            this.type = type;
            this.entityNameForRead = getEntityName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getEntityNameForRead() {
            return entityNameForRead;
        }

        public void setEntityNameForRead(String entityNameForRead) {
            this.entityNameForRead = entityNameForRead;
        }

    }

    public Map<String, FieldData> getFields() {
        return fields;
    }

    public void setFields(Map<String, FieldData> fields) {
        this.fields = fields;
    }

    
}
