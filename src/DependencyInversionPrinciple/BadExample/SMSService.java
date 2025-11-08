package DependencyInversionPrinciple.BadExample;

public class SMSService {
    public void sendNotification(String message) {
        System.out.println("Sending the notification via SMS : " + message);
    }
}
