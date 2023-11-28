package com.design.criacional.factoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {

       Notification notification = new NotificationFactory().createNotification("SMS");

       notification.notifyUser();
    }
}
