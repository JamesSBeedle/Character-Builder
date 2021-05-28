package com.BeedleElsmie.CharacterBuilder.Models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="abilities")
public class Ability {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="full-name")
    private String fullName;

    @Column(name = "description")
    private String description;

    @Column(name = "skills")
    private ArrayList<Skill> skills;

    public Ability(String name, String fullName, String description, ArrayList<Skill> skills) {
        this.name = name;
        this.fullName = fullName;
        this.description = description;
        this.skills = skills;
    }

    public Ability() {
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
