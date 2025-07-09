package com.Exception;


class InsufficientFundsException extends Exception 
{
    public InsufficientFundsException(String message) 
    {
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(int amount) {
        try {
            if (amount > balance) {
                throw new InsufficientFundsException("Withdrawal amount is greater than the balance.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter a lower amount within available balance.");
        }
    }
}

public class Ass52 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(12000.0);
        a1.withdraw(13000); // Should trigger exception
        a1.withdraw(5000);  // Should be successful
    }
}
