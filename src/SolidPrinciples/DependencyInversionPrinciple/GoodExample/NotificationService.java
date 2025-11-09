package SolidPrinciples.DependencyInversionPrinciple.GoodExample;

public class NotificationService {
    private final NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void sendNotification(String message) {
        this.notificationChannel.sendNotification(message);
    }
}
