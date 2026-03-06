/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem;

public class userbank {
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
}
