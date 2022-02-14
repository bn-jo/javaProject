package com.expert.lambda.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class LambdaSupplierApp {
    public static void main(String[] args) {
        Supplier<Integer> randumNumber1000 = ()->{

          Random randomNumberGenerator = new Random();
          return randomNumberGenerator.nextInt(1000) + 1 ;
        };
        System.out.println(randumNumber1000.get());
    }
}
