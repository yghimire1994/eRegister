package com.yubraj.eregister.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "eregister/home")
    public String displayHome() {
        return "HomePage";
    }

    @GetMapping(value = "/About")
    public String displayAbout() {
        return "AboutPage";


    }
}
