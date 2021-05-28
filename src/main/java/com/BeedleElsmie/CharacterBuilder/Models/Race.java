package com.BeedleElsmie.CharacterBuilder.Models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "races")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "speed")
    private int speed;

    @Column(name = "ability-bonus")
    private ArrayList<Ability> abilityBonus;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "age")
    private int age;

    @Column(name = "size")
    private String size;

    @Column(name = "size-description")
    private String sizeDescription;

    @Column(name = "starting-proficiencies")
    private ArrayList<Proficiency> startingProficiencies;

    @Column(name = "languages")
    private ArrayList<Language> languages;

    @Column(name = "language-description")
    private String languageDescription;

    @Column(name = "traits")
    private ArrayList<Trait> traits;

    @Column(name = "trait-options")
    private ArrayList<Trait>;

    @Column(name = "sub-races")
    private ArrayList<SubRace> subRaces;

    public Race(String name, int speed, ArrayList<Ability> abilityBonus, String alignment, int age, String size, String sizeDescription, ArrayList<Proficiency> startingProficiencies, ArrayList<Language> languages, String languageDescription, ArrayList<Trait> traits, ArrayList<SubRace> subRaces) {
        this.name = name;
        this.speed = speed;
        this.abilityBonus = abilityBonus;
        this.alignment = alignment;
        this.age = age;
        this.size = size;
        this.sizeDescription = sizeDescription;
        this.startingProficiencies = startingProficiencies;
        this.languages = languages;
        this.languageDescription = languageDescription;
        this.traits = traits;
        this.subRaces = subRaces;
    }

    public Race() {

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Ability> getAbilityBonus() {
        return abilityBonus;
    }

    public void setAbilityBonus(ArrayList<Ability> abilityBonus) {
        this.abilityBonus = abilityBonus;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSizeDescription() {
        return sizeDescription;
    }

    public void setSizeDescription(String sizeDescription) {
        this.sizeDescription = sizeDescription;
    }

    public ArrayList<Proficiency> getStartingProficiencies() {
        return startingProficiencies;
    }

    public void setStartingProficiencies(ArrayList<Proficiency> startingProficiencies) {
        this.startingProficiencies = startingProficiencies;
    }

    public ArrayList<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Language> languages) {
        this.languages = languages;
    }

    public String getLanguageDescription() {
        return languageDescription;
    }

    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    public ArrayList<Trait> getTraits() {
        return traits;
    }

    public void setTraits(ArrayList<Trait> traits) {
        this.traits = traits;
    }

    public ArrayList<SubRace> getSubRaces() {
        return subRaces;
    }

    public void setSubRaces(ArrayList<SubRace> subRaces) {
        this.subRaces = subRaces;
    }
}
