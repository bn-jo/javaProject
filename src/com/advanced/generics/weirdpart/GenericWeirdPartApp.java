package com.advanced.generics.weirdpart;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericWeirdPartApp {

    public static void main(String[] args) {


        ArrayList<Integer> lotteryNumber = new ArrayList<>(Arrays.asList(23,45,57,82,14));
        GenericFunction.addNumber(lotteryNumber);
        GenericFunction.printList(lotteryNumber);
        GenericFunction.displayToString(lotteryNumber);
        GenericFunction<Double> genericFunction = new GenericFunction<>();
        genericFunction.printSimpleGenerics(lotteryNumber);

    }
}
