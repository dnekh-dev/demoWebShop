package com.dnekh.demowebshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String info;
    @Getter
    @Setter
    private String image;
    @Getter
    @Setter
    private int price;

    public Items() {
    }

    public Items(String title, String info, String image, int price) {
        this.title = title;
        this.info = info;
        this.image = image;
        this.price = price;
    }
}
