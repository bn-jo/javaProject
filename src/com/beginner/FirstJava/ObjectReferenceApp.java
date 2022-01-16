package com.beginner.FirstJava;

public class ObjectReferenceApp {
    public static void main(String[] args) {

        Byte numberOfSeat = 5 ;
        Short hoursPower=392;
        Integer price = 14999;
        Long registrationNumber = 121212121212121212L;

        Float fuelCounsamptionCombined = 15.5F;
        Double fuelConsamptionPrecise = 15.232155556665555;

        Boolean isDamaged = !true ;
        Character energyEfficiencyCategory = '6';

        String carModel ="DodgeChallenger STR392";
        String carModelNew = new String ( "Dodge Challenger STR392");

        System.out.println("Number Of seats : "+numberOfSeat);
        System.out.println("Horse Power : "+hoursPower);
        System.out.println("Price : "+price.floatValue());
        System.out.println("Registration Number : "+registrationNumber);
        System.out.println("Combined fuel consumption : "+fuelCounsamptionCombined);
        System.out.println("Precise fuel consumption : "+fuelConsamptionPrecise.intValue());
        System.out.println("This car is Damaged : "+isDamaged);
        System.out.println("Car model with new key word : "+carModelNew.toUpperCase());


    }


}
