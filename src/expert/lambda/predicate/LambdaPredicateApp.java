package expert.lambda.predicate;

import java.util.function.Predicate;

public class LambdaPredicateApp {
    public static void main(String[] args) {
        Predicate<String> moreThenFive = text -> text.length() > 5;
        Predicate<String> startWithWelcome = text -> text.startsWith("Welcome");

        boolean isMoreThenFive = moreThenFive.test("Welcome");

        System.out.println("The text typed in is longer then five letters: " + isMoreThenFive);

        boolean isStartWithWelcome = startWithWelcome.test("Welcome");

        System.out.println("The text typed in start with \"Welcome\" : " + isStartWithWelcome);


        boolean isLassThenFiveLetters = moreThenFive.negate().test("Welcome");

        System.out.println("The text typed in is shorter then five letters: " + isLassThenFiveLetters);

        boolean isCombinedAnd = moreThenFive.and(startWithWelcome).test("Welcome");

        System.out.println("The text typed in is longer then five letters and starts with \"Welcome\": " + isCombinedAnd);


        boolean isCombinedOr = moreThenFive.or(startWithWelcome).test("Welcome");

        System.out.println("The text typed in is longer then five letters or starts with \"Welcome\": " + isCombinedOr);


    }
}
