package com.beginner.Controlflow;

public class FunctionApp {
    public static void main(String[] args) {
sayHello();
blackboardPunishment(5);
        System.out.println("The price ten precent OFF : "+getTenPreacentOffPrice(20000));
        System.out.println("The price 50 precent OFF : "+getDiscountPrice(20000,50));
        System.out.println("The price 50 precent OFF : "+getDiscountPrice(20000.75,60));

    }


    static void sayHello(){
        System.out.println("Hello !!! ");
    }


        static void blackboardPunishment(int repeatNumber){
        for (int i = 1; i <= repeatNumber; i++){
            System.out.println("Hello Ben This is working !!!!");


        }


            System.out.println();
}

static double getTenPreacentOffPrice(int price){
        return price*0.9;
}

static double getDiscountPrice(int price, int precent){
        return price*precent / 100.0;

}
static double getDiscountPrice(double price, int preacent){
        return price*preacent / 100;

}

}
