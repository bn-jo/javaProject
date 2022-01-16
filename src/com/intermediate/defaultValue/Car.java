package com.intermediate.defaultValue;

public class Car {
    private byte numberOfSeat;
    public short horsePower;
            private int price;
            private long registrationNumber;

            private float fuelConsumption;
            private double preciseFuelConsumption;
            private boolean isDamaged;
            private char energyEfficiencyCategory;
            private String color;
            private Boolean hasElectricEngine;
            private Engine engine;
            public void getDetails(){
                    System.out.println("A " + color + " car is created.");
                    System.out.println("Price: €" + price);
                    System.out.println("The car is damaged: " + isDamaged);
                    System.out.println("Registration number: " + registrationNumber);
                    System.out.println("Power: "  + "kW(" + horsePower + "hp)");
                    System.out.println("The car has Electric Engine :"+hasElectricEngine);
                    System.out.println("Energy efficiency category: "+ energyEfficiencyCategory);
                    System.out.println("precise Fuel Consumption: "+preciseFuelConsumption);
                    System.out.println("Number of seats : "+numberOfSeat);


        }



}
