package com.advanced.fileHandling;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {
    public static void main(String[] args) {


        String HAMLET_PART_FILE_PATH = "src/com/advanced/fileHandling/hamlet.txt";

        char[] firstHundredCharacters = new char [100];
        try ( FileReader hamletReader = new FileReader(HAMLET_PART_FILE_PATH)){
        hamletReader.read(firstHundredCharacters);
            System.out.println(firstHundredCharacters);
            System.out.println("\tRead More");
            System.out.println(firstHundredCharacters);
            System.out.println("\tRead More");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
