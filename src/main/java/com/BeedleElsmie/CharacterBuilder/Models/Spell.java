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

    @Column(name = "desc")
    private String desc;

    @Column(name = "higher-level")
    private String higher_level;

    @Column(name = "range")
    private int range;

    @Column(name = "components")
    private String components;

    @Column(name ="material")
    private String material;

    @Column(name = "ritual")
    private boolean ritual;

    @Column(name = "duration")
    private String duration;

    @Column(name = "casting-time")
    private String casting_time;

    @Column(name = "concentration")
    private boolean concentration;

    @Column(name = "attack-type")
    private String attack_type;

    @Column(name = "damage-type")
    private String damage_type;

    @Column(name = "damage-at-slot-level")
    private String damage_at_slot_level;

    @Column(name = "school")
    private String school;

    @Column(name = "classes")
    private ArrayList<Role> classes;

    @Column(name = "subclass")
    private ArrayList<SubClass> subclass;

    @Column(name = "level")
    private int level;

    public Spell(String name, String desc, String higher_level, int range, String components, String material, boolean ritual, String duration, String casting_time, boolean concentration, String attack_type, String damage_type, String damage_at_slot_level, String school, ArrayList<Role> classes, ArrayList<SubClass> subclass, int level) {
        this.name = name;
        this.desc = desc;
        this.higher_level = higher_level;
        this.range = range;
        this.components = components;
        this.material = material;
        this.ritual = ritual;
        this.duration = duration;
        this.casting_time = casting_time;
        this.concentration = concentration;
        this.attack_type = attack_type;
        this.damage_type = damage_type;
        this.damage_at_slot_level = damage_at_slot_level;
        this.school = school;
        this.classes = classes;
        this.subclass = subclass;
        this.level = level;
    }

    public Spell() {
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHigher_level() {
        return higher_level;
    }

    public void setHigher_level(String higher_level) {
        this.higher_level = higher_level;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isRitual() {
        return ritual;
    }

    public void setRitual(boolean ritual) {
        this.ritual = ritual;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCasting_time() {
        return casting_time;
    }

    public void setCasting_time(String casting_time) {
        this.casting_time = casting_time;
    }

    public boolean isConcentration() {
        return concentration;
    }

    public void setConcentration(boolean concentration) {
        this.concentration = concentration;
    }

    public String getAttack_type() {
        return attack_type;
    }

    public void setAttack_type(String attack_type) {
        this.attack_type = attack_type;
    }

    public String getDamage_type() {
        return damage_type;
    }

    public void setDamage_type(String damage_type) {
        this.damage_type = damage_type;
    }

    public String getDamage_at_slot_level() {
        return damage_at_slot_level;
    }

    public void setDamage_at_slot_level(String damage_at_slot_level) {
        this.damage_at_slot_level = damage_at_slot_level;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public ArrayList<Role> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Role> classes) {
        this.classes = classes;
    }

    public ArrayList<SubClass> getSubclass() {
        return subclass;
    }

    public void setSubclass(ArrayList<SubClass> subclass) {
        this.subclass = subclass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
