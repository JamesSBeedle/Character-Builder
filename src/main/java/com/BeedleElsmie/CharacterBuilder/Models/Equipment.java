package com.BeedleElsmie.CharacterBuilder.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;

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

    @Column(name = "damage-dice")
    private String damageDice;

    @Column(name = "damage-type")
    private String damageType;

    @Column(name = "range")
    private int range;

    @Column(name = "properties")
    private ArrayList<Property> properties;

    @Column(name = "two-handed-damage")
    private String twoHandedDamage;

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

    @ManyToMany(cascade=CascadeType.ALL)
    @JsonBackReference
    @JoinTable(
            name = "roles_equipment",
            joinColumns = { @JoinColumn(
                    name = "equipment_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "role_id",
                    nullable = false,
                    updatable = false)
            }
    )
    private ArrayList<Role> rolesStartingEquipment;

    public Equipment(String name, String equipmentCategory, String gearCategory, String weaponCategory, String categoryRange, String damageDice, String damageType, int range, ArrayList<Property> properties, String twoHandedDamage, int armorClass, int strMin, boolean stealthDisadvantage, String vehicleCategory, String description, int weight, int cost, ArrayList<Role> rolesStartingEquipment) {
        this.name = name;
        this.equipmentCategory = equipmentCategory;
        this.gearCategory = gearCategory;
        this.weaponCategory = weaponCategory;
        this.categoryRange = categoryRange;
        this.damageDice = damageDice;
        this.damageType = damageType;
        this.range = range;
        this.properties = properties;
        this.twoHandedDamage = twoHandedDamage;
        this.armorClass = armorClass;
        this.strMin = strMin;
        this.stealthDisadvantage = stealthDisadvantage;
        this.vehicleCategory = vehicleCategory;
        this.description = description;
        this.weight = weight;
        this.cost = cost;
        this.rolesStartingEquipment = rolesStartingEquipment;
    }

    public Equipment() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDamageDice() {
        return damageDice;
    }

    public void setDamageDice(String damageDice) {
        this.damageDice = damageDice;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
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

    public String getTwoHandedDamage() {
        return twoHandedDamage;
    }

    public void setTwoHandedDamage(String twoHandedDamage) {
        this.twoHandedDamage = twoHandedDamage;
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

    public ArrayList<Role> getRolesStartingEquipment() {
        return rolesStartingEquipment;
    }

    public void setRolesStartingEquipment(ArrayList<Role> rolesStartingEquipment) {
        this.rolesStartingEquipment = rolesStartingEquipment;
    }
}
