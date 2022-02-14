package com.expert.methodreference;

import java.util.*;

public class MethodRefernceApp {
    public static void main(String[] args) {

List<Person> pepole = List.of(new Person("Steve", 40),
new Person("Brit", 22),
        new Person("adam", 27),
        new Person("Anna", 32),
        new Person("Kumar",32),
        new Person("Anna",4),
        new Person("Anna",12));

         // PersonCompareisonProvider compareisonProvider = new PersonCompareisonProvider();

        pepole.stream()
        .sorted(PersonCompareisonProvider::compareByNameAndAge)
        .forEach(System.out::println);

        List<Integer> numbers = List.of(12,23,45,45,67,12,34,87,102);
        Set<Integer> numberSet = CollectionTransformer.transform(numbers, HashSet::new);
        System.out.println(numberSet);
        Set<Person> personSet = CollectionTransformer.transform(pepole, TreeSet::new);
        System.out.println(personSet);

    }

}

