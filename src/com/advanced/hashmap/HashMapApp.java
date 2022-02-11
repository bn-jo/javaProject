package com.advanced.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();


        capitals.put("England", "London");
        capitals.put("India", "New Delhi");
        capitals.put("Russia", "Moscow");
        capitals.put("England", "Oslo");


        System.out.println("The capital of England is: "+capitals.get("England"));

        capitals.remove("England","Oslo");

        System.out.println("The capital of England is: " +capitals.get("England"));


        if (capitals.containsValue("Moscow")){
            System.out.println("Russia is on the list.");
        }
        capitals.put(null, "The city is not on the list.");
            String userInput = "India";
        if (capitals.containsKey(userInput)){
        System.out.println(capitals.get(userInput));

        } else {
            System.out.println(capitals.get(null));
    }
        System.out.println(capitals.getOrDefault(userInput,"The city is not on  the list."));
        capitals.replace("India", "New Delhi","Mumbai");
        System.out.println("The replaced capital of India is: " +capitals.get("India"));

        capitals.putIfAbsent(userInput, "Copenhagen");
        capitals.remove(null);
        System.out.println("The following countries can be found in the hashmap: ");
        for (String country: capitals.keySet()){
            System.out.println("-"+ country);
        }
//        if (!capitals.containsKey(userInput)){
//            capitals.put(userInput, "Copenhagen")
//        }

    }
}
