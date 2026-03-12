package com.dark.ProductManagementApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int id;
    private String type;
    private String name;
    private String place;
    private int warranty;

    public Product(int id, String type, String name, String place, int warranty) {
        this.id = id;
        this.type = type.toLowerCase();
        this.name = name.toLowerCase();
        this.place = place.toLowerCase();
        this.warranty = warranty;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type.toLowerCase();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place.toLowerCase();
    }

    public int getWarranty() {
        return this.warranty;
    }
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    @Override
    public String toString() {
        return "id : " + this.getId() + "\n name :" + this.getName() + "\n place :" + this.getPlace() + "\n warranty :" + this.getWarranty() + "\n======================\n";
    }
}
