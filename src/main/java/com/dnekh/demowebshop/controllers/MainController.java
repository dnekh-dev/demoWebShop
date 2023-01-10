package com.dnekh.demowebshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name", "Mors");
        return "index";
    }

    @GetMapping("/about-us")
    public String aboutUs(@RequestParam(name="userName", required=false, defaultValue = "customer")
                              String userName, Model model) {
        model.addAttribute("name", userName);
        return "about";
    }
}