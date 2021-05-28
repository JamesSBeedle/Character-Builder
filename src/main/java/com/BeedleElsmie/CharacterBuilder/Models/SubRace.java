package com.BeedleElsmie.CharacterBuilder.Models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "subraces")
public class SubRace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "race")
    private Race race;

    @Column(name = "description")
    private String description;

    @Column(name = "ability_bonuses")
    private ArrayList<Ability> ability_bonuses;

    @Column(name = "starting_proficiencies")
    private ArrayList<Proficiency> starting_proficiencies;

    @Column(name = "languages")
    private ArrayList<Language> languages;

    @Column(name = "language_options")
    private ArrayList<Language> language_options;

    @Column(name = "racial_traits")
    private ArrayList<Trait> racial_traits;

    @Column(name = "racial_traits_options")
    private ArrayList<Trait> racial_traits_options;

    public SubRace(String name, Race race, String description, ArrayList<Ability> ability_bonuses, ArrayList<Proficiency> starting_proficiencies, ArrayList<Language> languages, ArrayList<Language> language_options, ArrayList<Trait> racial_traits, ArrayList<Trait> racial_traits_options) {
        this.name = name;
        this.race = race;
        this.description = description;
        this.ability_bonuses = ability_bonuses;
        this.starting_proficiencies = starting_proficiencies;
        this.languages = languages;
        this.language_options = language_options;
        this.racial_traits = racial_traits;
        this.racial_traits_options = racial_traits_options;
    }

    public SubRace() {
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

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Ability> getAbility_bonuses() {
        return ability_bonuses;
    }

    public void setAbility_bonuses(ArrayList<Ability> ability_bonuses) {
        this.ability_bonuses = ability_bonuses;
    }

    public ArrayList<Proficiency> getStarting_proficiencies() {
        return starting_proficiencies;
    }

    public void setStarting_proficiencies(ArrayList<Proficiency> starting_proficiencies) {
        this.starting_proficiencies = starting_proficiencies;
    }

    public ArrayList<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Language> languages) {
        this.languages = languages;
    }

    public ArrayList<Language> getLanguage_options() {
        return language_options;
    }

    public void setLanguage_options(ArrayList<Language> language_options) {
        this.language_options = language_options;
    }

    public ArrayList<Trait> getRacial_traits() {
        return racial_traits;
    }

    public void setRacial_traits(ArrayList<Trait> racial_traits) {
        this.racial_traits = racial_traits;
    }

    public ArrayList<Trait> getRacial_traits_options() {
        return racial_traits_options;
    }

    public void setRacial_traits_options(ArrayList<Trait> racial_traits_options) {
        this.racial_traits_options = racial_traits_options;
    }


}
