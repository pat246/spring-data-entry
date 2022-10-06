package com.me.dataentry.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.dataentry.dto.CustomLink;

@RestController
public class EntityController {

    @GetMapping("/index")
    public ResponseEntity<CustomLink> fetchAllLinks() throws InterruptedException {
        Thread.sleep(3 * 1000);
        CustomLink l1 = new CustomLink();
        l1._links = new CustomLink.Links();
        l1._links.countries = new CustomLink.Countries("India", true);
        l1._links.persons = new CustomLink.Persons("Rajesh", false);
        return ResponseEntity.ok(l1);
    }
}
