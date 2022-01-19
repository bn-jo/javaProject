package com.advanced.InnerClass.staticnested;

import com.advanced.enumCoding.PizzaSize;

public class Pizza {
    private String name;
    private PizzaSize pizzaSize;
    private  boolean isExtraTomatoSouse;
    private  boolean isSalad;

    private Pizza(Builder builder) {
        this.name = builder.name;
        this.pizzaSize = builder.pizzaSize;
        this.isExtraTomatoSouse = builder.isExtraTomatoSouse;
        this.isSalad = builder.isSalad;
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public boolean WithExtraTomatoSouse() {
        return isExtraTomatoSouse;
    }

    public boolean withSalad() {
        return isSalad ;
    }

    public static class  Builder {
        private String name;
        private PizzaSize pizzaSize;
        private  boolean isExtraTomatoSouse;
        private  boolean isSalad;

        Builder(String name , PizzaSize pizzaSize){
            this.name = name ;
            this.pizzaSize = pizzaSize;
        }
        public Builder WithExtraTomatoSouse(boolean isExtraTomatoSouse){
            this.isExtraTomatoSouse = isExtraTomatoSouse;
            return this;

        }

        public  Builder withSalad(boolean isSalad){
            this.isSalad = isSalad;
            return this;

        }
            public  Pizza build(){
            return new Pizza(this);
}
    }
}
