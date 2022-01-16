

package com.intermediate.encapsulation.Airplane;

public class AirplaneApp  {

    public static void main(String[] args) {Airplane airBusA380 = new AirBusA380("Air Bus A380", "White", 853, 717, 5, 40000, (short) 15000, true);
      airBusA380.getDescription();
      airBusA380.CallPilot();
      System.out.println("----------------------------------------------");


      Airplane Boeing747 = new Boeing747("Boeing747", "White", 366, 717, 7, 45000, (short) 15000, true);
            Boeing747.getDescription();
            Boeing747.CallPilot();
            System.out.println("----------------------------------------------");
    }

    }

