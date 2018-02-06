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

    public Cosmetics() {
    }

    public Cosmetics(String cosmbrand, Double cosmprice, Double cosmtotalrevenue, String popularity, int cosmquantity) {
        this.cosmbrand = cosmbrand;
        this.cosmprice = cosmprice;
        this.cosmtotalrevenue = cosmtotalrevenue;
        this.popularity = popularity;

        this.cosmquantity = cosmquantity;
    }

    private double cosmprice;
    private double cosmtotalrevenue;
    private String popularity;
    @Min(0)
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

    public Double getCosmprice() {
        return cosmprice;
    }

    public void setCosmprice(Double cosmprice) {
        this.cosmprice = cosmprice;
    }

    public Double getCosmtotalrevenue() {
        return cosmtotalrevenue;
    }

    public void setCosmtotalrevenue(Double cosmtotalrevenue) {
        this.cosmtotalrevenue = cosmprice * cosmquantity;
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
