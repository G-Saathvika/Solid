package com.soild;

public class DebitCard implements Transaction,Receipt{
    @Override
    public void doTransaction(double amount) {
        System.out.println("Fine paid using Debit card:");
        System.out.println(amount);
    }
    @Override
    public void displayReceipt(double amount) {
        System.out.println("Transaction of "+amount+" successful!");
    }
}
