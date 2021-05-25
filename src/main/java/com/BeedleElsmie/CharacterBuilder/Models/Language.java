package com.BeedleElsmie.CharacterBuilder.Models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "script")
    private String script;

    @Column(name = "typical_speakers")
    private List<String> typicalSpeakers;

    @Column(name = "description")
    private String description;


    public Language(String name, String type, String script, List<String> typicalSpeakers, String description) {
        this.name = name;
        this.type = type;
        this.script = script;
        this.typicalSpeakers = typicalSpeakers;
        this.description = description;
    }

    public Language() {
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

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public List<String> getTypicalSpeakers() {
        return typicalSpeakers;
    }

    public void setTypicalSpeakers(List<String> typicalSpeakers) {
        this.typicalSpeakers = typicalSpeakers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
