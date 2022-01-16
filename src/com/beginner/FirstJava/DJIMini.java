package com.beginner.FirstJava;

public class DJIMini {

    public static void main (String[]args){
        byte verNumber =2;
        byte ratingRank = 5;
        byte maxKilometer = 10;
        short price = 449;
        short comboprice = 599;
        short shippingPrce = 101;
        double whight = 8.8;
        double dimensionsa = 5.71;
        double dimensionsb = 5.51;
        double dimensionsc = 7.36;
        double frequencyrange = 5.725;
        double frequencyrangeb = 2.850;
        double frequencyrangc = 2.400;
        double frequencyrangd = 2.4835;
        int rating = 10013;


        System.out.println("DJI MINI "+verNumber);
        System.out.println("Price : "+price + "$");
        System.out.println("Combo Fly More Price : "+comboprice + "$");
        System.out.println("Shipping price : " +shippingPrce+"$");
        System.out.println("rating : "+rating);
        System.out.println("Customer Reviews : "+ratingRank+ " Stars");
        System.out.println("Product Dimensions : " + dimensionsa +"x" + dimensionsb + "x" + dimensionsc +" inches");
        System.out.println("Weight : " + whight +" ounces");
        System.out.println("Max Travel  : " + maxKilometer +" km");
        System.out.println("Operating Frequency  : " + frequencyrange + "-" + frequencyrangeb + " GHz, "+frequencyrangc+ "-" + frequencyrangd +" GHz " );



    }
}
