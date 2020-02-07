package com.shinoblee;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //GET PRINCIPAL
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);

	    //GET ANNUAL INTEREST RATE
        float annualInterest = (float)readNumber("Annual Interest Rate: ", 1, 30);

        //TERM PERIOD IN YEARS
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        //DISPLAY MORTGAGE
        printMortgage(principal, annualInterest, years);

        //DISPLAY THE PAYMENT AMOUNTS
        printPayments(principal, annualInterest, years);
    }

    private static void printPayments(int principal, float annualInterest, byte years) {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("================");
        remainingPayments(principal, annualInterest, years);
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String monthlyPayment = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("========");
        System.out.println("Monthly Payments: " + monthlyPayment);
    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        short totalPayments = (short)(years * MONTHS_IN_YEAR);
        double calculation = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, totalPayments)) / (Math.pow(1+monthlyInterest, totalPayments)-1);

        return calculation;
    }

    public static void remainingPayments(int principal, float annualInterest, byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short totalPayments = (short)(years * MONTHS_IN_YEAR);

        double balance;

        for (int payment = 1; payment <= totalPayments; payment++) {
            balance = principal * (Math.pow(1 + monthlyInterest, totalPayments) - Math.pow(1 + monthlyInterest, payment)) / (Math.pow(1 + monthlyInterest, totalPayments) - 1);
            String currentBalance = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(currentBalance);
        }

    }

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
