package com.beginner.Controlflow;

public class EnergyEfficiencyCategory {
    public static void main(String[] args) {
        getCarDescription("Tesla Roadstr", 2021, "Good");
        System.out.println();
        char energyEfficiencyCategory = 'G';

        switch (energyEfficiencyCategory) {
            case 'A':
            case 'a':
                System.out.println("VERY LOW Energy Consumption");
                break;
            case 'B':
            case 'b':
                System.out.println("LOW Energy Consumption");
                break;
            case 'C':
            case 'c':
                System.out.println("NORMAL Energy Consumption");
                break;
            case 'D':
            case 'd':
                System.out.println("ABOVE NORMAL Energy Consumption");
                break;
            case 'E':
            case 'e':
                System.out.println("HIGH Energy Consumption");
                break;
            case 'G':
            case 'g':
                System.out.println("VERY HIGH Energy Consumption");


                break;


        }

        String carModel = "Tesla Rodstr";
        Short year = 2018;
        String carCondition = "Damaged";
        System.out.println();
        System.out.println();
        System.out.println("This car is  " + carModel);
        System.out.println("Production year : " + year);


        if (carCondition.equals("Good")) {
            System.out.println("it`s in good condition ! ");
        } else if (carCondition.equals("Bad")) {
            System.out.println("This car is in Bad condition ! ");
        } else if (carCondition.equals("Damaged")) {
            System.out.println("This car is Damaged ! ! ! ");
            System.out.println();

        }


    }

    static void getCarDescription(String carModel, int year, String carCondition){
        System.out.println("This car is "+carModel);
        System.out.println("Production year : "+year);
        System.out.println("it`s in a " +carCondition + " condition" );




    }}

