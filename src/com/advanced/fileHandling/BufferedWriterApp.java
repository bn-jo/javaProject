package com.advanced.fileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterApp {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter("src/com/advanced/fileHandling/JuliusCesar.txt",true))){
       bufferedWriter.write("Even you? ");
       bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
