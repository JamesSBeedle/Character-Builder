package com.BeedleElsmie.CharacterBuilder.Models;

import javax.persistence.*;

@Entity
@Table(name = "spells")
public class Spell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "higher-level")
    private String higherLevel;

    @Column(name = "range")
    private int range;

    @Column(name = "components")
    private String components;

    @Column(name ="materials")
    private String materials;

    @Column(name = "ritual")
    private boolean ritual;

    @Column(name = "duration")
    private int duration;

    @Column(name = "casting-time")
    private String castingTime;

    @Column(name = "concentration")
    private boolean concentration;

    @Column(name = "attack-type")
    private String attackType;

    @Column(name = "damage-type")
    private String damageType;

    @Column(name = "damage-at-slot-level")
    private String damageAtSlotLevel;

    @Column(name = "school")
    private String school;

    @Column(name = "class")
    private ArrayList<Role> class;

    @Column(name = "sub-class")
    private ArrayList<SubClass> subClass;

    @Column(name = "level")
    private int level;


    public Spell(String name, String description, String higherLevel, int range, String components, String materials, boolean ritual, int duration, String castingTime, boolean concentration, String attackType, String damageType, String damageAtSlotLevel, String school, ArrayList<SubClass> subClass, int level) {
        this.name = name;
        this.description = description;
        this.higherLevel = higherLevel;
        this.range = range;
        this.components = components;
        this.materials = materials;
        this.ritual = ritual;
        this.duration = duration;
        this.castingTime = castingTime;
        this.concentration = concentration;
        this.attackType = attackType;
        this.damageType = damageType;
        this.damageAtSlotLevel = damageAtSlotLevel;
        this.school = school;
        this.subClass = subClass;
        this.level = level;
    }

    public Spell() {

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

    public String getHigherLevel() {
        return higherLevel;
    }

    public void setHigherLevel(String higherLevel) {
        this.higherLevel = higherLevel;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public boolean isRitual() {
        return ritual;
    }

    public void setRitual(boolean ritual) {
        this.ritual = ritual;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    public boolean isConcentration() {
        return concentration;
    }

    public void setConcentration(boolean concentration) {
        this.concentration = concentration;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getDamageAtSlotLevel() {
        return damageAtSlotLevel;
    }

    public void setDamageAtSlotLevel(String damageAtSlotLevel) {
        this.damageAtSlotLevel = damageAtSlotLevel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public ArrayList<SubClass> getSubClass() {
        return subClass;
    }

    public void setSubClass(ArrayList<SubClass> subClass) {
        this.subClass = subClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
