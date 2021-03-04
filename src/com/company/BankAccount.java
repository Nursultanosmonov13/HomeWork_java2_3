package com.company;

public class BankAccount {
    private double amount; //остаток на счете

    public double getAmount() {  //возвращает текущий остаток на счете
        return amount;
    }

    public void deposit(double sum) { //положить деньги на счет
        amount = sum;
    }

    public void withDraw(int sum) throws LimitException { //снимает указанную сумму со счета.

        if (amount <= sum) {
            System.out.println("Остаток на счету " + amount + " Только это сумму сняли");
            System.out.println(amount = amount - amount);
            throw new LimitException("Сумма превышает от остатка ", amount);
        }
        amount = amount - sum;
        System.out.println("Остаток на счету " + amount);
    }
}
