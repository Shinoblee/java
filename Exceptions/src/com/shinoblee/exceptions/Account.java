package com.shinoblee.exceptions;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0)
            throw new IOException();
//            throw new IllegalArgumentException();
    }

    public void withdraw(float value) throws AccountException {
        if (value > balance) {
            //EXAMPLE OF CHAINING EXCEPTIONS
            throw new AccountException(new InsufficientFundsException());
        }
    }
}
