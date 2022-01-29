package com.advanced.fileHandling;

import java.io.File;
import java.util.Arrays;

public class DirectoriesApp {
    public static void main(String[] args) {
        File businessBooksDirectory = new File("Ebooks/Business");
        if (businessBooksDirectory.mkdirs()){
            System.out.println("the new directory is created");
        }else{
            System.out.println("Can not create the directory");
        }
        businessBooksDirectory.deleteOnExit();

        File fileHandlingDirectory = new File("src/com/advanced/fileHandling");
        System.out.println("Files in the fileHandling directory: ");
        System.out.println(Arrays.toString(fileHandlingDirectory.list()));
        System.out.println(Arrays.toString(fileHandlingDirectory.listFiles()));
    }
}
