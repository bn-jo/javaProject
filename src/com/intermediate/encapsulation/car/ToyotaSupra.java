package com.intermediate.encapsulation.car;

public class ToyotaSupra extends Car{
    public static String color="blue";

    public ToyotaSupra( byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged) {
        super("Toyota Supra", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
    }

    @Override
    public void startTheEngine() {

        System.out.println("A " +color+ " Toyota Supra Engine is started.");
    }
}