package SolidPrinciples.DependencyInversionPrinciple.GoodExample;

public class WhatsAppMessaging implements NotificationChannel {
    public void sendNotification(String message) {
        System.out.println("Sending the notification via WhatsApp : " + message);
    }
}
