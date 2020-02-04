package com.example.catapi;

public class Cat {
    public String[] getBreed() {
        return breed;
    }

    public void setBreed(String[] breed) {
        this.breed = breed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public Cat()
    {}

    private String[] breed;
    private String id;
    private String url;
    private int width;
    private int height;



}
