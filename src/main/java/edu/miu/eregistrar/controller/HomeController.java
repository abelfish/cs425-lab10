package edu.miu.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String displayHomepage(){
        return "/index";
    }

    @GetMapping("/about")
    public String displayAboutUsPage(){
        return "/about";
    }
}
