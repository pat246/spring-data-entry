package com.me.dataentry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.me.dataentry.service.DataEntryService;

@RestController
public class DataEntryController {

    @Autowired
    DataEntryService dataEntryService;

    private static final Logger log = LoggerFactory.getLogger(DataEntryController.class);

    @GetMapping(path = "/me-profile/{profileName}", produces = "application/schema+json")
    public String profileData(@PathVariable("profileName") String profileName) {
        log.info("Fetching profile for {}", profileName);
        String springProfileData = dataEntryService.fetchProfileData(profileName);
        return springProfileData;
    }

}
