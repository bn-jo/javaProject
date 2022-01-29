package com.advanced.collection.arraylist;

import java.util.LinkedList;
import java.util.Locale;

public class Linkedlist {
    public static void main(String[] args) {


       LinkedList<String> morningRoutine = new LinkedList<>();




        if (!morningRoutine.isEmpty()){
        System.out.println("First element:  " + morningRoutine.getFirst());
            if (!morningRoutine.isEmpty() && morningRoutine.peekFirst() != null ){
                System.out.println("First element:  " + morningRoutine.peekFirst().toUpperCase());
                morningRoutine.add("Brushing my teeth");
                morningRoutine.add("go running");
                morningRoutine.add("buy food for the dog");
                morningRoutine.offer("Read book");
                System.out.println();
                System.out.println(morningRoutine);


    }}
}}
