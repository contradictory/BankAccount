package com.bank;

import com.account.BankAccount;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount ba = new BankAccount(123456789, 50.0, "siyulei", "lsy81056@gmail.com", "3528707632");
        System.out.println(ba.balance);
        ba.accountInfo();
    }
}
