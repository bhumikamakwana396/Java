package com.Exception;

class InsufficientFundsException1 extends Exception {
    private double amount;

    public InsufficientFundsException1(String message) 
    {
        super(message);
    }
}
