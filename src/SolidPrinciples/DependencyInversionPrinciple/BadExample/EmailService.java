package SolidPrinciples.DependencyInversionPrinciple.BadExample;

public class EmailService {
    public void sendNotification(String message) {
        System.out.println("Sending the notification via email : " + message);
    }
}
