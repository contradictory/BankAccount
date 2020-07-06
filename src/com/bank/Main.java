package com.bank;

import com.account.BankAccount;

public class Main {
    static BankAccount ba;

    public static void main(String[] args) {
	// write your code here
        ba = new BankAccount(123456789, 50.0, "siyulei", "lsy81056@gmail.com", "3528707632");
        System.out.println(ba.balance);
//        ba.accountInfo();
        depositMoney(50);
    }

    public static void showAccountBalance() {
        System.out.println("Balance: " + ba.balance);
    }

    public static void depositMoney(int fund) {
        ba.deposit(fund);
        System.out.println(ba.balance);
    }

    public static void withDraw(int fund) {
        if (ba.withdraw(fund) == true) {
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Withdraw failed");
            System.out.println(ba.customerName + ":" + String.valueOf(ba.balance));
        }
    }
}
