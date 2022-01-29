package com.advanced.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {

    public static void main(String[] args) {

        String HAMLET_PART_FILE_PATH = "src/com/advanced/fileHandling/hamlet.txt";

        try ( FileReader hamletReader = new FileReader(HAMLET_PART_FILE_PATH)){
            BufferedReader hamletBufferReader = new BufferedReader(hamletReader );
            extracted(hamletBufferReader);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void extracted(BufferedReader hamletBufferReader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line =  hamletBufferReader.readLine()) != null){
         stringBuilder.append(line);
         stringBuilder.append(System.lineSeparator());

}
        System.out.println(stringBuilder.toString());
    }
}
