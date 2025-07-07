package com.base;

public class Ass35 
{
	
	    static String bankName;
	    static double interestRate;
	    static int totalAccounts;

	    String customerName;
	    int accountNumber;
	    double balance;

	    // Static block to initialize bank info
	    static {
	        bankName = "SecureBank Ltd.";
	        interestRate = 6.5;
	        totalAccounts = 0;
	        System.out.println("Static Block: Bank Initialized");
	    }

	    // Constructor to create account
	    Ass35(String name, double initialDeposit) {
	        this.customerName = name;
	        this.accountNumber = ++totalAccounts;
	        this.balance = initialDeposit;
	        System.out.println("Account Created for " + customerName + " | A/C: " + accountNumber);
	    }

	    // Static method to get interest rate
	    static double getInterestRate() {
	        return interestRate;
	    }

	    // Instance method to show account info
	    void showDetails() {
	        System.out.println("----- Account Info -----");
	        System.out.println("Bank: " + bankName);
	        System.out.println("Name: " + customerName);
	        System.out.println("A/C No: " + accountNumber);
	        System.out.println("Balance: ₹" + balance);
	        System.out.println("Interest Rate: " + getInterestRate() + "%");
	    }

	    public static void main(String[] args) {
	        Ass35 acc1 = new Ass35("Amit", 5000);
	        Ass35 acc2 = new Ass35("Priya", 10000);

	        acc1.showDetails();
	        acc2.showDetails();

	        System.out.println("Total Accounts Created: " + Ass35.totalAccounts);
	    }
	}



