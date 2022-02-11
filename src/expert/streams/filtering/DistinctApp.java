package expert.streams.filtering;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctApp {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "pineapple", "watermelon","banana", "kiwi", "apple", "kiwi");
        List<String> availableFruits = fruits.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());


        System.out.println("Available fruits: ");
        System.out.println(availableFruits);
    }
}
