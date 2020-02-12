package com.shinoblee;

public class TaxCalculator2020 extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }


    //USE @OVERRIDE TO IMPLEMENT A INTERFACE METHOD
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
