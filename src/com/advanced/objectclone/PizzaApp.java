package com.advanced.objectclone;

import java.util.Arrays;

public class PizzaApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Available sizes :");
        for (PizzaSize pizzaSize : PizzaSize.values()){
            System.out.println("- "+pizzaSize.getPizzaSizeText());



        }
        Pizza pizzaOrder = new Pizza("Margareta", PizzaSize.MEDIUM);
        System.out.println("I ordered the following pizza : ");
        System.out.println("Name : "+pizzaOrder.getName());
        System.out.println("Size : "+pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println("Price : "+pizzaOrder.getPrice() +" $ ");



        Pizza samePizza = (Pizza) pizzaOrder.clone();

        System.out.println("I ordered the following pizza : ");
        System.out.println("Name : "+samePizza.getName());
        System.out.println("Size : "+samePizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Price : "+samePizza.getPrice() +" $ ");
        System.out.println("__________");
        System.out.println(pizzaOrder.equals(samePizza));
        System.out.println("");

        Pizza anotherPizza = new Pizza("Margareta", PizzaSize.LARGE);
        System.out.println(pizzaOrder.equals(anotherPizza));

        System.out.println("---------------");
        System.out.println(anotherPizza.getClass().getSimpleName());
        System.out.println(anotherPizza.getClass().getName());

//        System.out.println(Arrays.toString(anotherPizza.getClass().getField()));
//
//        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredField()));
//        System.out.println(Arrays.toString(anotherPizza.getClass().getMethod()));
//        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredMethod()));
        System.out.println(anotherPizza.getClass().getSuperclass());


        System.out.println("-----------------");
        System.out.println("Hash code pizza order: "+ pizzaOrder.hashCode());
        System.out.println("Hash code same pizza order: "+ samePizza.hashCode());
        System.out.println("Hash code same another pizza order: "+ anotherPizza.hashCode());

    }
}
