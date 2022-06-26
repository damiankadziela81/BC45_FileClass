package org.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\Damian\\Desktop\\secret_message.txt");
        File file2 = new File("C:/Users/Damian/Desktop/secret_message.txt");
        File file3 = new File("secret_message.txt");

        if(file1.exists()){
            System.out.println("File1 exists.");
        }
        else {
            System.out.println("File1 doesn't exist.");
        }

        if(file2.exists()){
            System.out.println("File2 exists.");
        }
        else {
            System.out.println("File2 doesn't exist.");
        }

        if(file3.exists()){
            System.out.println("File3 exists.");
            System.out.println(file3.getPath());
            System.out.println(file3.getAbsoluteFile());
            System.out.println(file3.isFile());
            file3.delete();
        }
        else {
            System.out.println("File3 doesn't exist.");
            file3.createNewFile();
        }


    }
}