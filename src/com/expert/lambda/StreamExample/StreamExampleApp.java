package com.expert.lambda.StreamExample;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleApp {

    public static void main(String[] args) {
        List<Integer> inputNumber = List.of(1,2,3,4,5);
        List<Integer> outputNumber = inputNumber
                .stream()
               // .filter(number -> number > 3)
                .map(number -> number * number )
                .collect(Collectors.toList());
        System.out.println(outputNumber);
    }
}
