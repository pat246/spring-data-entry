package com.me.dataentry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({ "/", "index" })
    public String indexPage(Model model) {
        return "home";
    }
}
