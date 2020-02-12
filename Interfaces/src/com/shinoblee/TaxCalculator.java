package com.shinoblee;

public interface TaxCalculator {
    //FIELDS ARE CONSTANTS DECLARED BELOW
    float minimumTax = 100;
    //NOT A RECOMMENDATION SOLUTION SINCE THESE ITEMS SHOULD BE IN IMPLEMENTATIONS NOT INTERFACES

    //INTERFACES SHOULD BE USED FOR WHATS NOT HOWS
    static double getTaxableIncome(double income, double expenses){
        return income - expenses;
    }
    //SHOULD NOT USE IMPLEMENTATION LOGIC IN AN INTERFACE

    

    double calculateTax();
}
