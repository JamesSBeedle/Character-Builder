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

    @Column(name = "equipment-category")
    private String equipmentCategory;

    @Column(name = "gear-category")
    private String gearCategory;

    @Column(name = "weapon-category")
    private String weaponCategory;

    @Column(name = "category-range")
    private String categoryRange;

    @Column(name = "damage")
    private Damage damage;

    @Column(name = "range")
    private int range;

    @Column(name = "properties")
    private ArrayList<Property> properties;

    @Column(name = "two-handed")
    private Damage twoHanded;

    @Column(name = "armor-class")
    private int armorClass;

    @Column(name = "str-min")
    private int strMin;

    @Column(name="stealth-disadvantage")
    private boolean stealthDisadvantage;

    @Column(name = "vehicle-category")
    private String vehicleCategory;

    @Column(name = "description")
    private String description;

    @Column(name ="weight")
    private int weight;

    @Column(name = "cost")
    private int cost;

    public Equipment(String name, String equipmentCategory, String gearCategory, String weaponCategory, String categoryRange, Damage damage, int range, ArrayList<Property> properties, Damage twoHanded, int armorClass, int strMin, boolean stealthDisadvantage, String vehicleCategory, String description, int weight, int cost) {
        this.name = name;
        this.equipmentCategory = equipmentCategory;
        this.gearCategory = gearCategory;
        this.weaponCategory = weaponCategory;
        this.categoryRange = categoryRange;
        this.damage = damage;
        this.range = range;
        this.properties = properties;
        this.twoHanded = twoHanded;
        this.armorClass = armorClass;
        this.strMin = strMin;
        this.stealthDisadvantage = stealthDisadvantage;
        this.vehicleCategory = vehicleCategory;
        this.description = description;
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

    public String getEquipmentCategory() {
        return equipmentCategory;
    }

    public void setEquipmentCategory(String equipmentCategory) {
        this.equipmentCategory = equipmentCategory;
    }

    public String getGearCategory() {
        return gearCategory;
    }

    public void setGearCategory(String gearCategory) {
        this.gearCategory = gearCategory;
    }

    public String getWeaponCategory() {
        return weaponCategory;
    }

    public void setWeaponCategory(String weaponCategory) {
        this.weaponCategory = weaponCategory;
    }

    public String getCategoryRange() {
        return categoryRange;
    }

    public void setCategoryRange(String categoryRange) {
        this.categoryRange = categoryRange;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public Damage getTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(Damage twoHanded) {
        this.twoHanded = twoHanded;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getStrMin() {
        return strMin;
    }

    public void setStrMin(int strMin) {
        this.strMin = strMin;
    }

    public boolean isStealthDisadvantage() {
        return stealthDisadvantage;
    }

    public void setStealthDisadvantage(boolean stealthDisadvantage) {
        this.stealthDisadvantage = stealthDisadvantage;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
