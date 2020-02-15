package com.shinoblee.exceptions;

//Checked -> Extend Exception Class
//Unchecked (runtime) -> Extend RuntimeExcpetion Class

public class InsufficientFundsException extends Exception{
    //DEFAULT CONSTRUCTOR WITH NO PARAMETERS
    public InsufficientFundsException() {
        super("Insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
