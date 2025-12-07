package DesignPatterns.BehaviouralPatterns.Iterator;
// This defines an interface for collections that provide an iterator for notifications.

import java.util.Iterator;

public interface NotificationCollection {
    public Iterator<Notification> createIterator();
}