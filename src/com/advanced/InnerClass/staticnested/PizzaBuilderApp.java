package com.advanced.InnerClass.staticnested;

import com.advanced.enumCoding.PizzaSize;

public class PizzaBuilderApp {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Pizza cake", PizzaSize.LARGE)
                .withSalad(true)
                .WithExtraTomatoSouse(true)
                .build();
        System.out.println("Name: "+pizza.getName());
        System.out.println("Size: "+pizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Extra souse: "+pizza.WithExtraTomatoSouse());
        System.out.println("Salad: "+pizza.withSalad());
    }
}
