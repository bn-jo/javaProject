package com.intermediate.classesandobjects;

import java.util.Random;

public class DodgeChallenger {


    byte numberOfSeat=5;
    byte numberOfSDoors=3;
    byte numberOfSVehcleOwners=1;
    byte emissionStiker=3;


    short power = 362;
    short horsePower = 492;
    short co2Emission =333;
    short cubicCapacity=6417;



    int price  = 29999;
    private int mileage = 14999;


    long registrationNumber = 2324453335554122L;

    float fuelConsumptionCombined = 15.5F;
    float fuelConsumptionUrban = 21.4F;


    double fuleConsumptionPreciseAverage = 1.56747457848e-1;


    boolean isDamaged = true;
    private char energyEfficiencyCategory = '6';
    String color;




    DodgeChallenger(){


    }

    DodgeChallenger(String color,byte numberOfSVehcleOwners,short power , short horsePower,short cubicCapacity,int price,int mileage,boolean isDamaged) {

        this.color = color;
        this.numberOfSVehcleOwners = numberOfSVehcleOwners;
        this.power = power;
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
this.price = price;
this.mileage = mileage;
this.isDamaged = isDamaged;

        Random randomNumberGenerator = new Random();
        this.registrationNumber = randomNumberGenerator.nextLong() ;










    }

    public DodgeChallenger(String orange) {

    }

    public void startTheEngine (){

    System.out.println("The engine is started !");
}

public void getDiscription (){
    System.out.println("A "+color+" Dodge Challenger is created .");
    System.out.println("2018 Doge Chalenger SRT 392");
    System.out.println("Price :$"+price);
    System.out.println("Mileage :"+mileage +" km");
    System.out.println("The car is Dameaged :"+isDamaged);
    System.out.println("The car Registration Number :"+registrationNumber);
    System.out.println("Power :"+power + "KW("+horsePower+"hp)");
    System.out.println("Co2 emission :"+co2Emission+" g/km");
    System.out.println("Emissin stiker :"+emissionStiker+ " Energy Category (" + energyEfficiencyCategory +")");
    System.out.println("Extra urban fuel consamption :"+fuelConsumptionCombined);
    System.out.println("Precise avrage fuel consamption :"+fuleConsumptionPreciseAverage);
    System.out.println("Number of previos owners :"+numberOfSVehcleOwners);
    System.out.println("Number of doors :"+numberOfSDoors);
    System.out.println("Number of seats :"+numberOfSeat);


}

}
