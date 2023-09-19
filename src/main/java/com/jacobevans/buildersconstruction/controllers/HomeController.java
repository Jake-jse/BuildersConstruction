package com.jacobevans.buildersconstruction.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() { return "index"; }

    @GetMapping("/basement")
    public String basement() { return "basement"; }

    @GetMapping("/deck")
    public String deck() { return "deck"; }

    @GetMapping("/kitchen")
    public String kitchen() { return "kitchen"; }

}
