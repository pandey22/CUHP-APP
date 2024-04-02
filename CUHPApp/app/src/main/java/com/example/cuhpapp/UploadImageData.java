package com.example.cuhpapp;

public class UploadImageData {
    private String image,key,category;

    public UploadImageData() {
    }

    public UploadImageData(String image, String key, String category) {
        this.image = image;
        this.key = key;
        this.category=category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
