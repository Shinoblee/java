package com.shinoblee;

import java.text.NumberFormat;

public class Mortgage {
    final private byte MONTHS_IN_YEAR = 12;
    final private byte PERCENT = 100;
    private int principal;
    private float annualInterest;
    private byte years;

    public Mortgage(int principal, float annualInterest, byte years){
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    private double calculateMortgage() {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short totalPayments = (short)(years * MONTHS_IN_YEAR);
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, totalPayments)) / (Math.pow(1+monthlyInterest, totalPayments)-1);
        return mortgage;
    }

    public void printMonthlyMortgage() {
        String monthlyPayment = NumberFormat.getCurrencyInstance().format(calculateMortgage());
        System.out.println("MORTGAGE");
        System.out.println("========");
        System.out.println("Monthly Payments: " + monthlyPayment + "\n");
    }

    public void paymentSchedule() {
        short totalPayments = (short)(years * MONTHS_IN_YEAR);
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("================");
        for (int payment = 1; payment <= totalPayments; payment++) {
            System.out.println(NumberFormat.getCurrencyInstance().format(currentBalance(payment,totalPayments)));
        }
    }

    private double currentBalance(int payment, short totalPayments) {
        float monthlyInterest = this.annualInterest / PERCENT / MONTHS_IN_YEAR;
        return principal * (Math.pow(1 + monthlyInterest, totalPayments) - Math.pow(1 + monthlyInterest, payment)) / (Math.pow(1 + monthlyInterest, totalPayments) - 1);
    }


}
