package com.BeedleElsmie.CharacterBuilder.Models;

public class Spells {

    private Long id;
    private String name;
    private String index;
    private String url;

    public Spells(Long id, String name, String index, String url) {
        this.id = id;
        this.name = name;
        this.index = index;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
