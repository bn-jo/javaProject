

package com.intermediate.encapsulation.car;

public class CarsApp {

    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3,
                (short)450, (short)717, (short)7700, 40000, 30000, true);
        redDodgeChallenger.startTheEngine();

        System.out.println(redDodgeChallenger.getCarName()+"`s price is $"+redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(35000);
        System.out.println(redDodgeChallenger.getCarName()+"`s NEW price is $"+redDodgeChallenger.getPrice());
        System.out.println("The car is in city mode.");
        redDodgeChallenger.startTheElectricEngine();
        System.out.println("The car has "+redDodgeChallenger.getMileage()+"Km");
        redDodgeChallenger.drive(140);
        System.out.println("After driving the car , it has "+redDodgeChallenger.getMileage()+"Km");
        //redDodgeChallenger.getDescription();

        System.out.println("----------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra((byte)1, (short)225, (short)717, (short)3500, 30000, 15000, false);
        //blackToyotaSupra.getDescription();
        blackToyotaSupra.startTheEngine();
        blackToyotaSupra = new ToyotaSupra((byte) 3, (short) 250, (short) 717,
                (short) 7700, 15000, 40000, true);
        System.out.println(blackToyotaSupra.getCarName()+"`s price is $"+blackToyotaSupra.getPrice());
        blackToyotaSupra.setPrice(14500);
        System.out.println(blackToyotaSupra.getCarName()+"`s NEW price is $"+blackToyotaSupra.getPrice());
        System.out.println("The car has "+blackToyotaSupra.getMileage()+"Km");
        blackToyotaSupra.drive(1000);
        System.out.println("After driving the car , it has "+blackToyotaSupra.getMileage()+"Km");

        //System.out.println(ToyotaSupra.color);



    }
}



