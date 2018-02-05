package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;


@Entity
public class Cosmetics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String cosmbrand;
    private Double cosmprice;

    public Cosmetics() {
    }

    public long getId() {
        return id;
    }

    public Cosmetics(String cosmbrand, Double cosmprice, String popularity, int cosmquantity) {
        this.cosmbrand = cosmbrand;
        this.cosmprice = cosmprice;
        this.popularity = popularity;
        this.cosmquantity = cosmquantity;
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

    public Double getCosmprice() {
        return cosmprice;
    }

    public void setCosmprice(Double cosmprice) {
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
    private String popularity;
    @Min(0)
    private int cosmquantity;


}
