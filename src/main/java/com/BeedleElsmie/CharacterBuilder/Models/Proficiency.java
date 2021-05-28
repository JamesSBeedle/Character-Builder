package com.BeedleElsmie.CharacterBuilder.Models;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="proficiencies")
public class Proficiency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name ="type")
    private String type;

    @Column(name ="classes")
    private ArrayList<Role> classes;

    @Column(name = "races")
    private ArrayList<Race> races;

    public Proficiency(String name, String type, ArrayList<Role> classes, ArrayList<Race> races) {
        this.name = name;
        this.type = type;
        this.classes = classes;
        this.races = races;
    }

    public Proficiency() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Role> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Role> classes) {
        this.classes = classes;
    }

    public ArrayList<Race> getRaces() {
        return races;
    }

    public void setRaces(ArrayList<Race> races) {
        this.races = races;
    }
}
