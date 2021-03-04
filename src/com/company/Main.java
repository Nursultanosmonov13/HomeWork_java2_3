package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        bankAccount.deposit(8000);
        bankAccount.deposit(500);
        bankAccount.deposit(300);
        System.out.println("Остаток на счету " + bankAccount.getAmount());
        while (true) {
            try {
                System.out.print("Введите сумму ");
                bankAccount.withDraw(scanner.nextInt());
            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage() + limitException.getRemainingAmount());
            }

        }
    }
}
