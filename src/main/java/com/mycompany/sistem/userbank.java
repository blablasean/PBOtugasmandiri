package com.mycompany.sistem;

public class User {
    private String accountNumber;
    private String name;
    private double balance;
    private String phoneNumber;
    private String accountType;

    // Constructor kosong
    public User() {
    }

    // Constructor dengan parameter
    public User(String accountNumber, String name, double balance, String phoneNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.name = name;
        setBalance(balance);
        this.phoneNumber = phoneNumber;
        this.accountType = accountType;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Setter dengan validasi
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() >= 10) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Nomor telepon tidak valid!");
        }
    }

    public void displayUserInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Account Type: " + accountType);
    }
}