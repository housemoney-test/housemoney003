package com.example.housemoney2.form;

import java.io.Serializable;

public class EditFixedCostForm implements Serializable {

	private int id;

    private int rentCosts;
    
    private int utilityCosts;
    
    private int phoneCosts;
    
    private int others;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRentCosts() {
        return rentCosts;
    }

    public void setRentCosts(int rentCosts) {
        this.rentCosts = rentCosts;
    }
    
    public int getUtilityCosts() {
        return utilityCosts;
    }

    public void setUtilityCosts(int utilityCosts) {
        this.utilityCosts = utilityCosts;
    }
    
    public int getPhoneCosts() {
        return phoneCosts;
    }

    public void setPhoneCosts(int phoneCosts) {
        this.phoneCosts = phoneCosts;
    }
    
    public int getOthers() {
        return others;
    }

    public void setOthers(int others) {
        this.others = others;
    }
}