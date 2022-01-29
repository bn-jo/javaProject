package com.advanced.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingClass {
    public static void main(String[] args) {

        String FILE_HANDLING_DIRECTORY = "src/com/advanced/fileHandling/";

        File famousQuotesFile = new File(FILE_HANDLING_DIRECTORY+"famousQuotes.txt");
        try {
            if (famousQuotesFile.createNewFile()){
                System.out.println("The file is renamed.");
        }
            if (famousQuotesFile.delete()){
                System.out.println("The file is deleted.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (famousQuotesFile.renameTo(new File(FILE_HANDLING_DIRECTORY + "famousPersonQuotes"))){
            System.out.println("The file is created.");
    }

}}
