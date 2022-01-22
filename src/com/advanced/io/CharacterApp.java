package com.advanced.io;

import java.util.Scanner;

public class CharacterApp {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to world of worlds");
        System.out.println("Here you can create your character: ");

        System.out.println("Name: ");
        String name = userInput.nextLine();

        System.out.println("Race (human or orc) : ");
        while (!userInput.hasNext("human") && !userInput.hasNext("orc") )
        {
            System.err.println("Invalid input you need to type in human or orc");
            userInput.nextLine();

        }
        String race = userInput.nextLine();


        System.out.println("Difficulty : 0 - eazy , 1 - medium , 2 - hard");
        while (!userInput.hasNextByte(3))
    {
        System.err.println("Invalid input you need to type in 0 or 1 or 2");
        userInput.nextLine();

    }
    byte difficulty = userInput.nextByte();


               System.out.println("Nightmare mode is on(true or false) : ");
        while (!userInput.hasNextBoolean())
    {
        System.err.println("Invalid input you need to type in true or false");
        userInput.nextLine();

    }
    boolean isNightmareModeOn = userInput.nextBoolean();
        System.out.println("_______________________");
        System.out.println(" You character is created: ");
        System.out.printf("Name: %s\n", name);

        System.out.printf("Race: %s\n", race);
        System.out.printf("Difficulty: %d\n", difficulty);
        System.out.printf("Nightmare Mode On : %b\n", isNightmareModeOn);
}
    }

