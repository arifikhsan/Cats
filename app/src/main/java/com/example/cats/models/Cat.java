package com.example.cats.models;

public class Cat {
    public String name;
    public String image;
    public String origin;
    public String lifeSpan;
    public String description;

    public Cat(String name, String image, String origin, String lifeSpan, String description) {
        this.name = name;
        this.image = image;
        this.origin = origin;
        this.lifeSpan = lifeSpan;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", origin='" + origin + '\'' +
                ", lifeSpan='" + lifeSpan + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
