package com.soild;

public class LibraryManagement {
    public static void main(String[] args) {

        AdministrativeStaff staff = new Librarian();
        staff.salaryInfo("John");


        NotificationService service = new EmailNotification();
        service.sendNotification();

        Transaction transaction = new CreditCard();
        Receipt receipt = new CreditCard();
        FineTransaction fine = new FineTransaction(transaction,receipt);
        fine.payFine(1000);

    }
}