/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

public class Manager {

    private String managerId;
    private String managerName;
    private String branchName;
    private String branchCode;
    private int totalAccounts;

    public Manager(String managerId, String managerName, String branchName, String branchCode) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.totalAccounts = 0;
    }

    // Create account
    public User createAccount(String accNumber, String name, double balance, String phone, String type) {

        if (balance < 0) {
            System.out.println("Saldo awal tidak boleh negatif!");
            return null;
        }

        User newUser = new User(accNumber, name, balance, phone, type);
        totalAccounts++;

        System.out.println("Akun berhasil dibuat!");
        return newUser;
    }

    public void showTotalAccounts() {
        System.out.println("Total akun: " + totalAccounts);
    }
}
