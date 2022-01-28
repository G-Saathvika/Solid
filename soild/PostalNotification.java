package com.soild;

public class PostalNotification implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("Sent notification through post.");
    }
}
