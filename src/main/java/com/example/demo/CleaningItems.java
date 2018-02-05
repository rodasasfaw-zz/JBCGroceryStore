package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CleaningItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cleaningbrand;
    private  String cleaningstrength;
    private int cleaningquantity;

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

    public int getCleaningprice() {
        return cleaningprice;
    }

    public void setCleaningprice(int cleaningprice) {
        this.cleaningprice = cleaningprice;
    }

    private int cleaningprice;

}
