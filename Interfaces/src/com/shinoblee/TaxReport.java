package com.shinoblee;

public class TaxReport {

    private TaxCalculator calculator;

    //EXAMPLE OF CONSTRUCTOR INJECTION
//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    //WITH METHOD INJECTION, DON'T NEED CONSTRUCTOR OR SETTER
    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
