package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cosmetics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cosmbrand;
    private double cosmprice;
    private String popularity;
    private int cosmquantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCosmbrand() {
        return cosmbrand;
    }

    public void setCosmbrand(String cosmbrand) {
        this.cosmbrand = cosmbrand;
    }

    public double getCosmprice() {
        return cosmprice;
    }

    public void setCosmprice(double cosmprice) {
        this.cosmprice = cosmprice;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public int getCosmquantity() {
        return cosmquantity;
    }

    public void setCosmquantity(int cosmquantity) {
        this.cosmquantity = cosmquantity;
    }
}
