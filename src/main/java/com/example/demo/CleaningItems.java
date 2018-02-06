package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class CleaningItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cleaningbrand;
    private  String cleaningstrength;

    @Min(0)
    private int cleaningquantity;

    public CleaningItems(String cleaningbrand, String cleaningstrength, int cleaningquantity, double cleaningprice, double cleaningtotalrevenue) {
        this.cleaningbrand = cleaningbrand;
        this.cleaningstrength = cleaningstrength;
        this.cleaningquantity = cleaningquantity;
        this.cleaningprice = cleaningprice;
        this.cleaningtotalrevenue = cleaningtotalrevenue;
    }

    public double getCleaningtotalrevenue() {
        return cleaningtotalrevenue;
    }

    public void setCleaningtotalrevenue(double cleaningtotalrevenue) {
        this.cleaningtotalrevenue =cleaningprice*cleaningquantity ;
    }

    private double cleaningprice;
    private double cleaningtotalrevenue;

    public CleaningItems() {
    }

    public CleaningItems(String cleaningbrand, String cleaningstrength, int cleaningquantity, double cleaningprice) {
        this.cleaningbrand = cleaningbrand;
        this.cleaningstrength = cleaningstrength;
        this.cleaningquantity = cleaningquantity;
        this.cleaningprice = cleaningprice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCleaningbrand() {
        return cleaningbrand;
    }

    public void setCleaningbrand(String cleaningbrand) {
        this.cleaningbrand = cleaningbrand;
    }

    public String getCleaningstrength() {
        return cleaningstrength;
    }

    public void setCleaningstrength(String cleaningstrength) {
        this.cleaningstrength = cleaningstrength;
    }

    public int getCleaningquantity() {
        return cleaningquantity;
    }

    public void setCleaningquantity(int cleaningquantity) {
        this.cleaningquantity = cleaningquantity;
    }

    public double getCleaningprice() {
        return cleaningprice;
    }

    public void setCleaningprice(double cleaningprice) {
        this.cleaningprice = cleaningprice;
    }


}
