package com.dnekh.demowebshop.controllers;

import com.dnekh.demowebshop.models.Item;
import com.dnekh.demowebshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/")
    public String index(Model model){
        Iterable<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
//        model.addAttribute("name", "Mors");
        return "index";
    }

    @GetMapping("/about-us")
    public String aboutUs(@RequestParam(name="userName", required=false, defaultValue = "customer")
                              String userName, Model model) {
        model.addAttribute("name", userName);
        return "about";
    }
}