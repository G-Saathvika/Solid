package com.soild;

public class CreditCard implements Receipt, Transaction {
    @Override
    public void doTransaction(double amount) {
        System.out.println("Fine paid using Credit card:");
        System.out.println(amount);
    }

    @Override
    public void displayReceipt(double amount) {
        System.out.println("Transaction of "+amount+" successful!");
    }

}
