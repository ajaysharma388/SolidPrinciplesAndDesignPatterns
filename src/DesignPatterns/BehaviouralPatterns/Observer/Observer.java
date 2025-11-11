package DesignPatterns.BehaviouralPatterns.Observer;

// The Observer interface defines the update method for receiving stock price change notifications.

public interface Observer {
    void update(String stockSymbol, double newPrice);
}
