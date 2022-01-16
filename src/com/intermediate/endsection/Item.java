package com.intermediate.endsection;

public class Item {
    private static String name;
    private static double value;

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

        public static String getName() {
            return name;
        }

        public static double getValue() {
            return value;
        }
}