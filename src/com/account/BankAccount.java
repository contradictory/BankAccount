package com.account;

public class BankAccount {
    public int accountNumber;
    public double balance;
    public String customerName;
    public String email;
    public String phoneNumber;

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int fund) {
        balance = balance + fund;
        System.out.println("Deposit successful.");

    }

    public boolean withdraw(int deduct) {
        if (balance >= deduct) {
            balance -= deduct;
            System.out.println("success");
            return true;
        } else {
            System.out.println(customerName + ":" + String.valueOf(balance));
            return false;
        }
    }

    public void accountInfo() {
        System.out.println("account username:" + customerName);
        System.out.println("account number:" + String.valueOf(accountNumber));
        System.out.println("account balance:" + String.valueOf(balance));
        System.out.println("account email:" + email);
        System.out.println("phone number:" + phoneNumber);
    }



}
