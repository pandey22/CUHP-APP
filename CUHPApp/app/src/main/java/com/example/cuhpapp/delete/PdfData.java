package com.example.cuhpapp.delete;

public class PdfData {
    String title,url,key;

    public PdfData(String title, String url, String key) {
        this.title = title;
        this.url = url;
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public PdfData() {
    }
}
