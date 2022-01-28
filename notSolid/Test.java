package com.notsolid;

public class Test {
    public static void main(String[] args) {

        Library_Management manager = new Library_Management();
        manager.addBook("Harry Potter");

        Staff  staff = new Librarian();
        staff.loginAndLogout();

        Notification_Service type = new Notification_Service();
        type.notify("email");

        CreditCardPayment cc = new CreditCardPayment();
        FineTransaction fine = new FineTransaction(cc);
        fine.payFine(500);

    }
}

interface ManageBooks{
    //violates Interface Segregation Principle
    public void addBook(String name);
    public void removeBook(String name);
}

class Library_Management implements ManageBooks{
    //violates single responsibility
    @Override
    public void addBook(String name) {
        System.out.println("Add book : "+name);
    }

    @Override
    public void removeBook(String name) {
        System.out.println("Remove book : "+name);
    }
}

abstract class Staff{
    public abstract void loginAndLogout();
    public abstract void manageApplications();

}
class Librarian extends Staff{

    @Override
    public void loginAndLogout() {
        System.out.println("Login and logout of system");
    }

    @Override
    public void manageApplications() {
        System.out.println("Mange applications of members");
    }
}
class Clerk extends Staff{
    //violates Liskov Principle
    @Override
    public void loginAndLogout() {
        System.out.println("Clerk can't login and logout of system");
    }

    @Override
    public void manageApplications() {
        System.out.println("Clerk can't manage applications");
    }
}
class Notification_Service {

    public void notify(String typeOfNotification) {
        //violates Open-Closed Principle
        if (typeOfNotification.equalsIgnoreCase("email")) {
            System.out.println("Notification sent through email.");
        } else if (typeOfNotification.equalsIgnoreCase("post")) {
            System.out.println("Notification sent through post.");
        }
    }

}

abstract class Transaction{
    public abstract void doTransaction(double amount);

}
class CreditCardPayment extends Transaction{
    public void doTransaction(double amount) {
        System.out.println("Fine paid using Credit card:");
        System.out.println(amount);
    }

}
class DebitCardPayment extends Transaction{
    public void doTransaction(double amount) {
        System.out.println("Fine paid using Debit card:");
        System.out.println(amount);
    }
}

class FineTransaction{
    //violates Dependency Inversion Principle
    private CreditCardPayment credit;

    public FineTransaction(CreditCardPayment credit) {
        this.credit = credit;
    }

    public void payFine(double amount){
        credit.doTransaction(amount);
    }
}
