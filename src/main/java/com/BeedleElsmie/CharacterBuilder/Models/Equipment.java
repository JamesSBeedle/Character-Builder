package com.BeedleElsmie.CharacterBuilder.Models;

import javax.persistence.*;

@Entity
@Table(name = "equipments")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name ="index")
    private String index;

    @Column(name ="url")
    private String url;

    public Equipment(String name, String index, String url) {
        this.id = id;
        this.name = name;
        this.index = index;
        this.url = url;
    }

    public Equipment(){

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
