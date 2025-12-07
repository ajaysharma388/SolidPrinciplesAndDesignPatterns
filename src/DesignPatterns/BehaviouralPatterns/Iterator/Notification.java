package DesignPatterns.BehaviouralPatterns.Iterator;

// This class represents a notification with a message for managing notifications.

public class Notification {
    private final String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}