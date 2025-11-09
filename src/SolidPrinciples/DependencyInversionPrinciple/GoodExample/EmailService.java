package SolidPrinciples.DependencyInversionPrinciple.GoodExample;

public class EmailService implements NotificationChannel {
    public void sendNotification(String message) {
        System.out.println("Sending the notification via email : " + message);
    }
}
