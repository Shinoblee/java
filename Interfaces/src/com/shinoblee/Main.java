package com.shinoblee;

public class Main {

    public static void main(String[] args) {
        //CONSTRUCTOR INJECTION
        var calculator = new TaxCalculator2020(100_000);
//        var report = new TaxReport(calculator);
//        report.show();

        //SETTER INJECTION
//        report.setCalculator(new TaxCalculator2021());
//        report.show();

        //METHOD INJECTION
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2021());
    }
}
