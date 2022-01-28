package com.soild;

public class EmailNotification implements NotificationService{

        @Override
        public void sendNotification() {
            System.out.println("Sent notification through email.");
        }

}


