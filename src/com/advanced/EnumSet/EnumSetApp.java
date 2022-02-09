package com.advanced.EnumSet;

import com.advanced.objectclone.PizzaSize;

import java.util.EnumSet;

public class EnumSetApp {


    public static void main(String[] args) {

        EnumSet<PizzaSize> pizzaSizes = EnumSet.allOf(PizzaSize.class);
        System.out.println("Available pizza size: "+ pizzaSizes);
        EnumSet<PizzaSize> basicPizzaSizes = EnumSet.of(PizzaSize.SMALL, PizzaSize.MEDIUM, PizzaSize.LARGE);
        System.out.println("Basic pizza sizes : "+ basicPizzaSizes);


    }
}
