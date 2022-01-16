package com.beginner.Controlflow;

public class WhoWhantsToBeAMillioner {

    public static void main(String[] args) {

        char answer = 'C';

        System.out.println("Who is named as the inventor of the light bulb? ");

        System.out.println("You marked " + answer + ". let's see if you are right ! ");

        if (answer == 'C') {
            System.out.println("You are right . you won 1000$.");
        } else {
            System.out.println("Sorry. the right answer is Tomas Edison . Thanks for coming .");

        }


    }}