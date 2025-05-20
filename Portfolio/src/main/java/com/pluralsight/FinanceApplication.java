package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("pam", "123", 12500);
        BankAccount account2 = new BankAccount("Gary", "456", 1500);
//        Valuable account3 = new BankAccount("Mark", "789", 1500);

        account1.deposit(100);
        account2.deposit(100);
//        account3.deposit(200);
    }
}
