package com.shinoblee.exceptions;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() throws IOException {
//        sayHello(null);

        //EXAMPLE OF A CHECKED EXCEPTION
//        FileReader reader = null;

        //THIS IS AN EXAMPLE OF TRY WITH RESOURCES STATEMENT
        //TO WORK THE CLASS NEEDS TO IMPLEMENT THE AutoCloseable CLASS
//        try (
//            var reader = new FileReader("file.txt");
//            var writer = new FileWriter("...");
//        ) {
////            reader = new FileReader("file.txt");
//            System.out.println("File opened");
//            var value = reader.read();
//            new SimpleDateFormat().parse("");
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        //CAN CATCH MULTIPLE EXCEPTIONS
//        } catch(IOException | ParseException ex) {
//            System.out.println("Could not read data");
//        }
        //IF YOU USE TRY W/ RESOURCES YOU DON'T NEED TO TERMINATE WITH A FINALLY BLOCK
//        finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


        var account = new Account();
//        try {
//            account.deposit(-1);
//        } catch (IOException e) {
//            System.out.println("Logging");
//            throw e;
//        }
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }

    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
