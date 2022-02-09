package com.advanced.objectclone;

public enum PizzaSize {
    SMALL("Small Size"),MEDIUM("Medium Size"),LARGE("Large Size"),EXTRA_LARGE("Extra Large Size");


    private String pizzaSizeText;
    PizzaSize(String pizzaSizeText){
        this.pizzaSizeText = pizzaSizeText;
    }
    public String getPizzaSizeText(){
        return pizzaSizeText;
    }
}
