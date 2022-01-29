package com.advanced.fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterApp {
    public static void main(String[] args) {
        String JULIUS_FILE_PATH = "src/com/advanced/fileHandling/JuliusCesar.txt";
    try ( PrintWriter bookWriter = new PrintWriter(JULIUS_FILE_PATH)){
        bookWriter.println("Even you ? ,Brutus ");
        bookWriter.println(12.5);
    } catch (IOException e) {
        e.printStackTrace();
    }


    }
}
