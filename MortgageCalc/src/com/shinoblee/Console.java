package com.shinoblee;

import java.util.Scanner;

public class Console {

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value < min || value > max) {
                System.out.println("Enter a number between " + (int)min + " and " + (int)max);
                continue;
            }else {
                return value;
            }
        }
    }
}
