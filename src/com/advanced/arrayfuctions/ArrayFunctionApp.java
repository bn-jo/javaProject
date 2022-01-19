package com.advanced.arrayfuctions;

import java.util.Arrays;

public class ArrayFunctionApp {

    public static void main(String[] args) {

        int[] gamerPoint;
        gamerPoint = new int[12];
        System.out.println(Arrays.toString(gamerPoint));

        System.out.println("All players s with 200 points." );
        Arrays.fill(gamerPoint,200);
        System.out.println(Arrays.toString(gamerPoint));

        System.out.println("The first 10 players lost 20 points" );
        Arrays.fill(gamerPoint,0,10,180);
        System.out.println(Arrays.toString(gamerPoint));

        System.out.println("The 10 th player gaind 50 points");
        gamerPoint[9]+= 50;
        System.out.println(Arrays.toString(gamerPoint));

        System.out.println("The gamer points in order");
        Arrays.sort(gamerPoint);
        System.out.println(Arrays.toString(gamerPoint));

        System.out.println("The last 5 points");
        int[] lastFivePoints = Arrays.copyOf(gamerPoint,5);
        System.out.println(Arrays.toString(lastFivePoints));


        System.out.println("The top 5 points");
        int[] topFivePoints = Arrays.copyOfRange(gamerPoint,gamerPoint.length-5,gamerPoint.length);
        System.out.println(Arrays.toString(lastFivePoints));

        gamerPoint[4]=300;
        Arrays.sort(gamerPoint);


        if (Arrays.equals(lastFivePoints,topFivePoints)) {


            System.out.println("The top five players have the same points as the last 5 players");
        }else {
            System.out.println("The top 5 players do`nt have the same points as the 5 last players");
        }
        if (Arrays.binarySearch(gamerPoint,300)>=0) {
            System.out.println("Someone reached 300 points. The game is over !");

        }else {
            System.out.println("There is no one reached 300 points yet");
        }
    }
}
