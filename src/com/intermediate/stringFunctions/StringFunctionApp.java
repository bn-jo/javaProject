package com.intermediate.stringFunctions;

import java.util.Locale;
import java.util.Scanner;

public class StringFunctionApp {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String inputText = keyboardInput.nextLine();

        if (inputText.equals("Paris")) {
            System.out.println("Paris was Typed in ");
        }
        else {
            System.out.println("The text typed in is : "+inputText);
        }
        if (inputText.equals("Paris")) {
            System.out.println("Paris was Typed in ");
        }
        else {
            System.out.println("The text typed in is : "+inputText);
        }

        if (inputText.contains("Par")){

            System.out.println("The input text contains Par");
        }

        if (inputText.isEmpty()){

            System.out.println("The input is empty");
        }
        System.out.println("The input text length is :  "+inputText.length());

        System.out.println("The input text uppercase: "+inputText.toUpperCase());
        System.out.println("The input text lowercase: "+inputText.toLowerCase());

        if (inputText.startsWith("P")|| inputText.endsWith("p")) {
            System.out.println("The input text start or end with P letter");
        }
        System.out.println("The replaced text: "+inputText.replace("N","D"));

        }

    }

