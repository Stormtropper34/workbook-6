package com.pluralsight.finance;

public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void charge(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void pay(double amount) {
        if (amount > 0) {
            this.balance -= amount;
            if (this.balance < 0) {
                this.balance = 0;
            }
        }
    }



    @Override
    public double getValue() {
        return this.balance;
    }
}
