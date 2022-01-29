package com.advanced.finalPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GameService {

    private static  final  String SRC_COM_ADVANCED_FINAL_WORD_TXT ="src/com/advanced/finalPractice/word.txt" ;

    public void start() throws FileNotFoundException {
   Scanner InputScanner = new Scanner(System.in);
    String randomWord = getRandomWord();
    char[] randomWordArray = randomWord.toCharArray();
    char[] gussungArray = new char[randomWord.length()];
        Arrays.fill(gussungArray,'_');
        int numberOfChances = randomWord.length();
        System.out.println("Starting the game");
        System.out.println("The length of the word and the number of chances: "+numberOfChances);
        System.out.println("The word: " + new String(gussungArray));

    while (true){
        System.out.println("-------------");
        System.out.print("Please Type in a letter: ");
        String inputLine = InputScanner .nextLine().toLowerCase();
        char letter = inputLine.charAt(0);
        System.out.println(letter);
        boolean isGuessingCorrect = false;
        for (int i = 0; i < randomWord.length(); i++) {
            if (letter==randomWordArray[i]){
                gussungArray[i] = letter;
                isGuessingCorrect = true;

            }

        }

        if (isGuessingCorrect){
            System.out.println("It Was A Good Guess !");
            if (isGameFinish(gussungArray)){
                break;
            }
        }else {
            numberOfChances--;
            if (numberOfChances == 0 ){
                System.out.println("Sorry you run out of chances.");
                System.out.println("the word was : "+randomWord);
                break;
            }
            System.out.println("Your number of chances is decresed to : "+numberOfChances);
            System.out.println("Try another letter ! ");
        }
        System.out.println("The word: " + new String(gussungArray));
    }
    }

    private boolean isGameFinish(char[] gussungArray) {
        for (int i = 0; i < gussungArray.length ; i++) {
            if(gussungArray[i] == '_'){
                return false;
            }
        }
        System.out.println();
        System.out.println("\t\t\t Congratulation You Won !");
        System.out.println("the word : "+new String(gussungArray));
        return true;
    }

    private String getRandomWord() throws FileNotFoundException {
        List<String> words = getTheWords();
        Random randomNumber = new Random();
        int randomIndex = randomNumber.nextInt(words.size());

        return words.get(randomIndex);
    }

    private List<String> getTheWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        File wordsFile = new File(SRC_COM_ADVANCED_FINAL_WORD_TXT);
        Scanner wordScanner = new Scanner(wordsFile);
        while (wordScanner.hasNextLine()){
            words.add(wordScanner.nextLine());
        }
        return words;
    }
}
