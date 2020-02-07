package com.shinoblee;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int x = 1;
//        int y = 1;
//        System.out.println(x != y);
//
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = false;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;
//        System.out.println(isEligible);

//        int temp = 25;
//        if(temp > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("Drink water");
//        } else if(temp > 20) {
//            System.out.println("Beautiful day");
//        } else {
//            System.out.println("Cold day");
//        }

//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);
//        System.out.println(hasHighIncome);

//        String className = income > 100_000 ? "First" : "Economy";
//        System.out.println(className);

//        String role = "guest";
//        switch (role) {
//            case "admin":
//                System.out.println("You're an admin");
//                break;
//            case "moderator":
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You are a guest");
//        }

//        Scanner myObj = new Scanner(System.in);
//        System.out.print("Number: ");

//        byte userInput = myObj.nextByte();
//        if (userInput % 5 == 0 && userInput % 3 == 0) {
//            System.out.println("Fizzbuzz");
//        } else if (userInput % 5 == 0) {
//            System.out.println("Fizz");
//        } else if (userInput % 3 == 0){
//            System.out.println("Buzz");
//        } else {
//            System.out.println(userInput);
//        }


//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello World " + i);
//        }

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while(true){
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if(input.equals("quit"))
//                break;
//        }

//        do {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));

//        String[] fruits = {"Apple", "Mango", "Orange"};
//
//        for (int i = 0; i < fruits.length; i++)
//            System.out.println(fruits[i]);
//
//        //CAN NOT ITERATE BACKWARDS & DON'T HAVE ACCESS TO INDEX VALUE
//        for (String fruit : fruits)
//            System.out.println(fruit);

//        String message = greetUser("Lee", "Simon");
//        System.out.println(message);
//    }
//
//    public static String greetUser(String firstName, String lastName) {
//        return "Hello " + firstName + " " + lastName;
//    }

        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");

    }

    public static void printNumbers(int limit) {
        for (int i = 0; i <= limit; i++)
            System.out.println(i);
    }

}
