package com.BeedleElsmie.CharacterBuilder.Models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "traits")
public class Trait {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "races")
    private ArrayList<Race> races;

    @Column(name = "sub_races")
    private ArrayList<SubRace> sub_races;

    @Column(name = "proficiencies")
    private ArrayList<Property> properties;

    public Trait(String name, String description, ArrayList<Race> races, ArrayList<SubRace> sub_races, ArrayList<Property> properties) {
        this.name = name;
        this.description = description;
        this.races = races;
        this.sub_races = sub_races;
        this.properties = properties;
    }

    public Trait() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Race> getRaces() {
        return races;
    }

    public void setRaces(ArrayList<Race> races) {
        this.races = races;
    }

    public ArrayList<SubRace> getSub_races() {
        return sub_races;
    }

    public void setSub_races(ArrayList<SubRace> sub_races) {
        this.sub_races = sub_races;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
}
