package com.advanced.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerApp {

    public static void main(String[] args) {


        String starWarsQuote = " May , the  , force , be  , with  , you , !";
        System.out.println("We are using string tokenizer here: ");


        StringTokenizer stringTokenizer = new StringTokenizer(starWarsQuote,",") ;
        System.out.println("Number of tokens : "+stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
        System.out.println("We are using strings split function here: ");
        String[] starWarsQuoteWords = starWarsQuote.split(",",3);
        System.out.println("Number of element : "+ starWarsQuoteWords.length);
        for (String starWarsQuotWords : starWarsQuoteWords){
            System.out.println(starWarsQuotWords);
        }
    }
}




