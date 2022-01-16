package com.beginner.arrays;

import java.util.Random;

public class ArraysApp {

    public static void main(String[] args) {
        int[] lotterynumber = new int[5];
        Random randumNumberGenerator = new Random();



        lotterynumber[0] = randumNumberGenerator.nextInt(90)+1;
        lotterynumber[1] = randumNumberGenerator.nextInt(90)+1;
        lotterynumber[2] = randumNumberGenerator.nextInt(90)+1;
        lotterynumber[3] = randumNumberGenerator.nextInt(90)+1;
        lotterynumber[4] = randumNumberGenerator.nextInt(90)+1;

        for (int lottterNumber :lotterynumber){
            System.out.println(lottterNumber);
        }




        System.out.println();
        System.out.println();


int [][] weeklyLotteryNumber ={
        {1,2,3,4,5},
        {10,20,30,40,50},
        {13,24,35,46,54},
        {15,26,38,44,55}
};
        for (int i = 0; i < weeklyLotteryNumber.length ; i++) {
            for (int j = 0; j <weeklyLotteryNumber[i].length; j++) {
                System.out.print(weeklyLotteryNumber[i][j]+" ");

            }
            System.out.println();

        }


    }
}
