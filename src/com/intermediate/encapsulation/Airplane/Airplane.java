package com.intermediate.encapsulation.Airplane;

import java.util.Random;
public class Airplane {
    private String color;
    private String airPlaneName;
    private int numberOfSeats = 853;
    private byte numberOfDoors = 3;
    private byte emissionSticker = 6;
    private short WingSpan = 73;
    private short topSpeed =  1185 ;
    private long registrationNumber = 134513532145234553L;

    public Airplane(String airplaneName , String color, short numberOfSeats, byte numberOfDoors, byte emissionSticker,
                    short wingSpan, short topSpeed){
        this.airPlaneName = airplaneName;
        this.color = color;
        this.numberOfSeats= numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.emissionSticker = emissionSticker;
        this.WingSpan = wingSpan;
        this.topSpeed = topSpeed;
        Random randomNumberGenerator = new Random();
        this.registrationNumber = randomNumberGenerator.nextLong();
    }
    public void CallPilot() {
        System.out.println("Call the pilot ");
    }
    public void getDescription(){
        System.out.println("A " + color + " " + airPlaneName + " is created.");
        System.out.println("Number of seats : " + numberOfSeats);
        System.out.println("Number of doors : " + numberOfDoors);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Emission sticker: " + emissionSticker);
        System.out.println("Top speed :  " + topSpeed + "km/h");
        System.out.println("WingSpan : " + WingSpan);
}
        }


