package com.soild;

public class FineTransaction {
    private Transaction t;
    private Receipt r;
    public FineTransaction(Transaction t,Receipt r) {
        this.t = t;
        this.r=r;
    }

    public void payFine(double amount) {
        t.doTransaction(amount);
        r.displayReceipt(amount);
    }
}
