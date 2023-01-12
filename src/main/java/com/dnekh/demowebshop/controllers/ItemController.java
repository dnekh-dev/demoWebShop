package com.dnekh.demowebshop.controllers;

import com.dnekh.demowebshop.models.Item;
import com.dnekh.demowebshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items/add")
    public String redirectToAddingProductPage() {
        return "add-item";
    }

    @PostMapping("/items/add")
    public String storeItem(
            @RequestParam String title,
            @RequestParam String image,
            @RequestParam String price,
            @RequestParam String info
                        ) {
        Item item = new Item(title, info, image, Integer.parseInt(price));
        itemRepository.save(item);
        return "redirect:/";
    }
}
