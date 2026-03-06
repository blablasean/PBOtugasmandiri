/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem;

import java.util.Scanner;

public class Sistem{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        managerbank manager = new managerbank("M01", "Andi", "Main Branch", "BR01");
        tellerbank teller = new tellerbank("T01", "Budi", "Morning");

        userbank user = null;

        int choice;

        do {
            System.out.println("\n=== BANK SYSTEM ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    input.nextLine();
                    System.out.print("Account Number: ");
                    String acc = input.nextLine();

                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Initial Balance: ");
                    double bal = input.nextDouble();

                    input.nextLine();
                    System.out.print("Phone: ");
                    String phone = input.nextLine();

                    System.out.print("Account Type: ");
                    String type = input.nextLine();

                    user = manager.createAccount(acc, name, bal, phone, type);
                    break;

                case 2:
                    if (user == null) {
                        System.out.println("Buat akun dulu!");
                    } else {
                        System.out.print("Jumlah deposit: ");
                        double dep = input.nextDouble();
                        teller.deposit(user, dep);
                    }
                    break;

                case 3:
                    if (user == null) {
                        System.out.println("Buat akun dulu!");
                    } else {
                        System.out.print("Jumlah withdraw: ");
                        double wit = input.nextDouble();
                        teller.withdraw(user, wit);
                    }
                    break;

                case 4:
                    if (user == null) {
                        System.out.println("Buat akun dulu!");
                    } else {
                        teller.checkBalance(user);
                    }
                    break;

            }

        } while (choice != 5);

        System.out.println("Program selesai.");
    }
}
