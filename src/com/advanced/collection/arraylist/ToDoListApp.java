package com.advanced.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ToDoListApp {

    public static void main(String[] args) {
        ArrayList<String> urgentTasks = new ArrayList<>();
        ArrayList<String> allTasks = new ArrayList<>();


        urgentTasks.add("Repairing the car");
        urgentTasks.add("Paying checks");

        allTasks.add("Clean my room");
        allTasks.add("Go to the grocery store");
        Collections.swap(urgentTasks,0,1);
//        urgentTasks.clear();
if (!urgentTasks.isEmpty()){
        System.out.println("Urgent Tasks : ");
        System.out.println();
        for (String task : urgentTasks) {
            System.out.println("- " + task);
        }
        }
        allTasks.addAll(urgentTasks);

        Collections.sort(allTasks,Collections.reverseOrder());
        

        System.out.println();
        System.out.println("All Tasks: ");
        System.out.println();
        for (String task : allTasks){
            System.out.println("- "+ task);

        }
        System.out.println("------");


        if (allTasks.contains("Clean my room")){
            System.out.println("You did`nt clean your room");
        }



        System.out.println("------");
        System.out.println("Most important: ");

        for (String task : allTasks.subList(0,3)){
            System.out.println("- "+ task);

        }
Collections.shuffle(allTasks);
        System.out.println("------");
        System.out.println("shuffle: ");

        for (String task : allTasks){
            System.out.println("- "+ task);

        }
}}
