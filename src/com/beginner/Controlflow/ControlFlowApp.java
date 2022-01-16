package com.beginner.Controlflow;

public class ControlFlowApp {
    public static void main(String[] args) {

        boolean isDamadeg = !true;
        String carColor = "yellow";
        char energyEfficiencyCategory = 'Z';

        if (isDamadeg) {

            System.out.println("Damaged car ! ");
        } else {
            System.out.println("Accident free !");
        }
        if (carColor.equals("red")) {
            System.out.println("This car is red ! ");
        } else if (carColor.equals("green")) {
            System.out.println("This car is green ! ");
        } else if (carColor.equals("blue")) {
            System.out.println("This car is blue ! ");
        } else if (carColor.equals("purple")) {
            System.out.println("This car is purple ! ");
        } else {
            System.out.println("I don`t know what the color of the car ! ");

        }

        switch (energyEfficiencyCategory){
            case 'A' :

            case 'B':
                System.out.println("Low Energy Consumption");
                break;

            case 'G' :
                System.out.println("Very High Energy Consumption ! ");
                break;
            default:
                System.out.println("Not Defined Category ");

        }

        {
            int numberOfOwner = 5 ;
            numberOfOwner++;
            {


            }
            System.out.println("Number Of Owners : "+numberOfOwner);

        }



    }
}