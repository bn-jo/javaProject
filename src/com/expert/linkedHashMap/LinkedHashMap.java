package com.expert.linkedHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMap {

    public static void main(String[] args) {
        Map<String, Double> productPricesHashMap= new HashMap<>();
       productPricesHashMap.put("Chocolate bar", 1.5) ;
        productPricesHashMap.put("Apple",0.15) ;
        productPricesHashMap.put("Pasta", 1.1) ;
        productPricesHashMap.put("Avocado", 1.2) ;
        for (String product : productPricesHashMap.keySet()){
            System.out.println(product+ " $ " + productPricesHashMap.get(product));

        }
        Map<String, Double> productPricesLinkedHashMap= new java.util.LinkedHashMap<>();
        productPricesLinkedHashMap.put("Chocolate bar", 1.5) ;
        productPricesLinkedHashMap.put("Apple",0.15) ;
        productPricesLinkedHashMap.put("Pasta", 1.1) ;
        productPricesLinkedHashMap.put("Avocado", 1.2) ;
        System.out.println();
        System.out.println("Linked Hashmap : ");

        for (String product :  productPricesLinkedHashMap.keySet()){
            System.out.println(product+ " $ " + productPricesLinkedHashMap.get(product));

        }
        Map<String, Double> productPricesTreeMap= new TreeMap<>();
        productPricesTreeMap.put("Chocolate bar", 1.5) ;
        productPricesTreeMap.put("Apple",0.15) ;
        productPricesTreeMap.put("Pasta", 1.1) ;
        productPricesTreeMap.put("Avocado", 1.2) ;

        System.out.println();
        System.out.println("TreeMap : ");
        for (String product :  productPricesTreeMap.keySet()){
            System.out.println(product+ " $ " + productPricesTreeMap.get(product));

        }
    }
}
