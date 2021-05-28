package com.BeedleElsmie.CharacterBuilder.Models;

import javax.persistence.*;

@Entity
@Table(name = "feats")
public class Feat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private int level;

    @Column(name = "prerequisites")
    private String prerequisites;

    @Column(name = "description")
    private String description;

    @Column(name = "class")
    private ArrayList<Role> role;

    public Feat(String name, int level, String prerequisites, String description, ArrayList<Role> role) {
        this.name = name;
        this.level = level;
        this.prerequisites = prerequisites;
        this.description = description;
        this.role = role;
    }

    public Feat() {

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Role> getRole() {
        return role;
    }

    public void setRole(ArrayList<Role> role) {
        this.role = role;
    }
}
