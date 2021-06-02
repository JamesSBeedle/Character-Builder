package com.BeedleElsmie.CharacterBuilder.Models;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "subclasses")
public class SubClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private String role;

    @Column(name = "subclass_flavour")
    private String subclass_flavour;

    @Column(name = "spells")
    private ArrayList<Spell> spells;

    @Column(name ="description")
    private String description;

    public SubClass(String name, String role, String subclass_flavour, ArrayList<Spell> spells, String description) {
        this.name = name;
        this.role = role;
        this.subclass_flavour = subclass_flavour;
        this.spells = spells;
        this.description = description;
    }

    public SubClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubclass_flavour() {
        return subclass_flavour;
    }

    public void setSubclass_flavour(String subclass_flavour) {
        this.subclass_flavour = subclass_flavour;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
