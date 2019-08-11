package com.example.cats.data;

import com.example.cats.models.About;

public class AboutData {
    public static About about;

    public static About getAbout() {
        about.setName("Arif Ikhsanudin");
        about.setImage("");
        about.setEmail("arif.ikhsanudin.developer@gmail.com");
        return about;
    }
}
