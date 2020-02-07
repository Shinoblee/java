package com.shinoblee;

public class Main {

    public static void main(String[] args) {

        //GET PRINCIPAL
        int principal =  (int)Console.readNumber("Principal (1K-1M): ", 1000, 1000000);

	    //GET ANNUAL INTEREST RATE
        float annualInterest = (float)Console.readNumber("Annual Interest Rate: ", 1, 30);

        //TERM PERIOD IN YEARS
        byte years = (byte)Console.readNumber("Period (Years): ", 1, 30);

        var mortgage = new Mortgage(principal, annualInterest, years);

        //DISPLAY MORTGAGE
        mortgage.printMonthlyMortgage();

        //DISPLAY THE PAYMENT AMOUNTS
        mortgage.paymentSchedule();
    }


}
