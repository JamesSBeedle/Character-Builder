package com.BeedleElsmie.CharacterBuilder.Models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "hit_die")
    private String hit_die;

    @Column(name = "proficiencies")
    private ArrayList<Proficiency> proficiencies;

    @Column(name = "saving_throws")
    private String saving_throws;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name = "roles_equipment",
            joinColumns = { @JoinColumn(
                    name = "role_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "equipment_id",
                    nullable = false,
                    updatable = false)
            }
    )
    @Column(name = "starting_equipment")
    private ArrayList<Equipment> starting_equipment;

    @Column(name = "starting_equipment_options")
    private ArrayList<Equipment> starting_equipment_options;

    @OneToMany(mappedBy = "role")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JsonBackReference
    private ArrayList<SubClass> subclass;

    @Column(name = "spellcasting_ability")
    private String spellcasting_ability;

    public Role(String name, String hit_die, ArrayList<Proficiency> proficiencies, String saving_throws, ArrayList<Equipment> starting_equipment, ArrayList<Equipment> starting_equipment_options, ArrayList<SubClass> subclass, String spellcasting_ability) {
        this.name = name;
        this.hit_die = hit_die;
        this.proficiencies = proficiencies;
        this.saving_throws = saving_throws;
        this.starting_equipment = starting_equipment;
        this.starting_equipment_options = starting_equipment_options;
        this.subclass = subclass;
        this.spellcasting_ability = spellcasting_ability;
    }

    public Role() {
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

    public String getHit_die() {
        return hit_die;
    }

    public void setHit_die(String hit_die) {
        this.hit_die = hit_die;
    }

    public ArrayList<Proficiency> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(ArrayList<Proficiency> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public String getSaving_throws() {
        return saving_throws;
    }

    public void setSaving_throws(String saving_throws) {
        this.saving_throws = saving_throws;
    }

    public ArrayList<Equipment> getStarting_equipment() {
        return starting_equipment;
    }

    public void setStarting_equipment(ArrayList<Equipment> starting_equipment) {
        this.starting_equipment = starting_equipment;
    }

    public ArrayList<Equipment> getStarting_equipment_options() {
        return starting_equipment_options;
    }

    public void setStarting_equipment_options(ArrayList<Equipment> starting_equipment_options) {
        this.starting_equipment_options = starting_equipment_options;
    }

    public ArrayList<SubClass> getSubclass() {
        return subclass;
    }

    public void setSubclass(ArrayList<SubClass> subclass) {
        this.subclass = subclass;
    }

    public String getSpellcasting_ability() {
        return spellcasting_ability;
    }

    public void setSpellcasting_ability(String spellcasting_ability) {
        this.spellcasting_ability = spellcasting_ability;
    }
}
