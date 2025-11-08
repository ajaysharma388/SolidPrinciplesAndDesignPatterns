package DependencyInversionPrinciple.GoodExample;

public class SMSService implements NotificationChannel {
    public void sendNotification(String message) {
        System.out.println("Sending the notification via SMS : " + message);
    }
}
