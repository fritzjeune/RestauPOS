package com.ayitigenius.restaupos.models;

public class Comestible {
    private int id;
    private String name;
    private String description;
    private String image;
    private ComestibleCategory category;

    public Comestible(ComestibleCategory category, String image, String description, String name, int id) {
        this.category = category;
        this.image = image;
        this.description = description;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ComestibleCategory getCategory() {
        return category;
    }

    public void setCategory(ComestibleCategory category) {
        this.category = category;
    }
}
