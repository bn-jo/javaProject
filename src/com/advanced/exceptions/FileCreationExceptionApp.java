package com.advanced.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreationExceptionApp {
    public static void main(String[] args) throws IOException {
createFile("outputFile.txt");
    }


    private static void createFile(String fileName) {
        PrintWriter outputFile = null;
        try {

           outputFile = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
          System.err.println("Caught an IOException: " + e.getMessage());
//          createFile("1-"+fileName);
        } finally {
            if (outputFile != null){
                outputFile.close();
                System.out.println("The PrintWrite is closed ");
            }else {
                System.out.println("The print writer is not open");
            }
        }
        System.out.println("This line comes after we tried to create a file.");
    }

}
