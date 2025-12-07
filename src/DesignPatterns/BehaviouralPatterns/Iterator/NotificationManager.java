package DesignPatterns.BehaviouralPatterns.Iterator;

// This class manages different types of notifications (email, SMS, push) and provides methods to add notifications and print them using an iterator pattern.
import java.util.Iterator;

public class NotificationManager {

    private final NotificationCollection emailNotifications;
    private final NotificationCollection smsNotifications;
    private final NotificationCollection pushNotifications;

    public NotificationManager() {
        emailNotifications = new EmailNotification();
        smsNotifications = new SMSNotification();
        pushNotifications = new PushNotification();
    }

    public void addEmailNotification(String message) {
        ((EmailNotification) emailNotifications).addNotification(message);
    }

    public void addSMSNotification(String message) {
        ((SMSNotification) smsNotifications).addNotification(message);
    }

    public void addPushNotification(String message) {
        ((PushNotification) pushNotifications).addNotification(message);
    }

    public void printAllNotifications() {
        printNotifications(emailNotifications.createIterator(), "Email");
        printNotifications(smsNotifications.createIterator(), "SMS");
        printNotifications(pushNotifications.createIterator(), "Push");
    }

    private void printNotifications(Iterator<Notification> iterator, String type) {
        System.out.println(type + " Notifications:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getMessage());
        }
    }
}