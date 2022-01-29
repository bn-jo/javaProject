package com.advanced.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String[] args) {
String JULIUS_FILE_PATH = "src/com/advanced/fileHandling/JuliusCesar.txt";
        try( FileWriter bookWriter = new FileWriter(JULIUS_FILE_PATH,true)) {
           bookWriter.write(" Even you, Brutus?");
           bookWriter.append("\nYes.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
