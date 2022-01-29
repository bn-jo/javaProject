package com.advanced.generics.weirdpart;

import java.util.ArrayList;

public class GenericFunction<T> {
ArrayList<?> listOfUnknown;
    public static <T extends  Number> void displayToString(ArrayList<Integer> typeData){
        System.out.println(typeData.toString());
    }

    public  static void  addNumber(ArrayList<? super  Integer>  list){
        for (int i = 1; i < 10; i++) {
            list.add(i);


        }
    }
    public static void printList (ArrayList<?> list){
        for (Object element : list)
        {
            System.out.println(element+" ");


        }
        System.out.println();
    }

    public void printSimpleGenerics(ArrayList<Integer> lotteryNumber) {
    }
}
