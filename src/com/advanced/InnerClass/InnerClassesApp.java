package com.advanced.InnerClass;

import com.advanced.enumCoding.PizzaSize;


public class InnerClassesApp {


    private static boolean isPizzaReady(int waitedInMinutes){
        class Oven{
            public boolean isPizzaBakedProperly(){
                if(waitedInMinutes>30) {
                    return true;
                }
                return false;
                }
            }
            Oven oven = new Oven();
        return oven.isPizzaBakedProperly();}

    public static void main(String[] args) {

        Pizza firstPizza = new Pizza(" Margarita", PizzaSize.MEDIUM);
        System.out.println("Name:" + firstPizza.getName());
        System.out.println("Size: "+firstPizza.getPizzaSize());
        Pizza.PizzaSlice firstpizzaSlice = firstPizza.cutPizzaSlice();
        System.out.println(firstpizzaSlice.calculatePizzaSliceArea());

        Pizza secondPizza  = new Pizza(" Margarita", PizzaSize.MEDIUM){
           @Override
            public String getName() {
            return"Anonymous";

        }
    };

        System.out.println("Name: " +secondPizza.getName());

if (isPizzaReady(40)) {
    System.out.println("The Pizza is ready !");
} else {
    System.out.println("Pizza is not ready yet .");

}
Pizza thirdPizza = new Pizza("Pizza cake",PizzaSize.LARGE);
Pizza.PizzaSlice pizzaSlice = thirdPizza.cutPizzaSlice();
        System.out.println(pizzaSlice.calculatePizzaSliceArea());
}
    }


