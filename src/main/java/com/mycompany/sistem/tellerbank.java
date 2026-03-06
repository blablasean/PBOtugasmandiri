/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

public class tellerbank{

    private String tellerId;
    private String tellerName;
    private String shift;

    public tellerbank(String tellerId, String tellerName, String shift) {
        this.tellerId = tellerId;
        this.tellerName = tellerName;
        this.shift = shift;
    }

    // Deposit
    public void deposit(userbank user, double amount) {
        if (amount > 0) { // VALIDATION 1
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
            System.out.println("Deposit berhasil. Saldo sekarang: " + user.getBalance());
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0!");
        }
    }

    // Withdraw
    public void withdraw(userbank user, double amount) {
        if (amount <= 0) { // VALIDATION 2
            System.out.println("Jumlah penarikan tidak valid!");
        } else if (amount > user.getBalance()) { // VALIDATION 3
            System.out.println("Saldo tidak cukup!");
        } else {
            double newBalance = user.getBalance() - amount;
            user.setBalance(newBalance);
            System.out.println("Withdraw berhasil. Saldo sekarang: " + user.getBalance());
        }
    }

    // Cek saldo
    public void checkBalance(userbank user) {
        System.out.println("Saldo saat ini: " + user.getBalance());
    }
}
