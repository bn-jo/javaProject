package com.intermediate.endsection;

public class Item {

    static String name;
  static double value;

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