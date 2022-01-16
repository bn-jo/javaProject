package com.beginner.FirstJava;

public class MyFirstJavaApp {
    public static void main (String[]args)
    {
  byte numberOfSeat=5;
        byte numberOfSDoors=3;
        byte numberOfSVehcleOwners=1;
        byte emissionStiker=3;


        short power = 362;
        short horsePower = 492;
        short co2Emission =333;
        short cubicCapacity=6417;



        int price  = 29999;
        int mileage = 14999;


        long registrationNumber = 2324453335554122L;

float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;


        double fuleConsumptionPreciseAverage = 1.56747457848e-1;


        boolean isDamaged = true;
        char energyEfficiencyCategory = '6';

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


        System.out.println("Convertion");
        short newNumberOfSeats = numberOfSeat;
        System.out.println("The value of new number of seats:"+newNumberOfSeats);

        double newFuelConsamptionCombined = fuelConsumptionCombined;
        System.out.println("The value of new fuel consamption :"+newFuelConsamptionCombined + "1/100km");


        byte newPower = (byte) power;
        System.out.println("Value Of New Power :"+newPower+"(kw)");

    }}
