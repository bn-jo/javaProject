package com.intermediate.classesandobjects;

import java.util.Locale;

public class CarsApp {
    public static void main(String[] args) {

        DodgeChallenger dodgeChallenger = new DodgeChallenger() ;

        dodgeChallenger.getDiscription();

        dodgeChallenger.startTheEngine();
        System.out.println("---------------------------------------------");

        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange",(byte) 1,(short) 392,
                (short) 492,(short) 6700,30000,20000,false) ;
        System.out.println(orangeDodgeChallenger.color.toUpperCase());
        //anutherDodgeChallenger.getDiscription();
orangeDodgeChallenger.startTheEngine();
orangeDodgeChallenger.getDiscription();

        System.out.println();


        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red",(byte) 3,(short) 492,
                (short) 492,(short) 6700,40000,20000,false) ;
        System.out.println(redDodgeChallenger.color.toUpperCase());
        //anutherDodgeChallenger.getDiscription();
        orangeDodgeChallenger.startTheEngine();
        orangeDodgeChallenger.getDiscription();






            }
        }


