package com.advanced.collection.arraylist;

import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        Vector<String> toDoVector = new Vector<>(2,3);

        System.out.println("Initial capacity of the vector: "+toDoVector.capacity());
        toDoVector.add("Clean the garden");
        toDoVector.add("Clean my room");
        toDoVector.add("Taking the dog for a walk");
        System.out.println("capacity of the vector after adding 3 elements: "+toDoVector.capacity());
        System.out.println("capacity of the vector after adding 3 elements: "+toDoVector.size());
        System.out.println("First element of the vector : "+toDoVector.firstElement());
        System.out.println("Last element is: "+toDoVector.lastElement());



    }

}
