package com.example.housemoney2.form;

import java.io.Serializable;

public class EditSpendingForm implements Serializable {

	private int id;

    private int foodCosts;
    
    private int lifeCosts;
    
    private int others;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoodCosts() {
        return foodCosts;
    }

    public void setFoodCosts(int foodCosts) {
        this.foodCosts = foodCosts;
    }
    
    public int getLifeCosts() {
        return lifeCosts;
    }

    public void setLifeCosts(int lifeCosts) {
        this.lifeCosts = lifeCosts;
    }
    
    public int getOthers() {
        return others;
    }

    public void setOthers(int others) {
        this.others = others;
    }
}