package com.intermediate.encapsulation.car;

public class DodgeChallenger extends Car implements ElectricMode{


    private static final String color = "red" ;

    public DodgeChallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
                           int price, int mileage, boolean isDamaged){
        super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }


    @Override
    public void startTheEngine() {
        System.out.println("A "+color+ " Dodge Challenger engine is started.");
    }

    @Override
    public void startTheElectricEngine() {
        System.out.println("Dodge Challenger Start its Electric engine");
    }
}