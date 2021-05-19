package com.BeedleElsmie.CharacterBuilder.Models;

import javax.persistence.*;

@Entity
@Table(name = "equipments")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name ="quantity")
    private int quantity;

    @Column(name ="weight")
    private int weight;

    @Column(name = "cost")
    private int cost;

    public Equipment(String name, int quantity, int weight, int cost) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.cost = cost;
    }

    public Equipment() {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
