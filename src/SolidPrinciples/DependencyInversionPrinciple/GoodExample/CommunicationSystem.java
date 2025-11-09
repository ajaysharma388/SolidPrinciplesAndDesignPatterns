package SolidPrinciples.DependencyInversionPrinciple.GoodExample;

public class CommunicationSystem {
    public static void main(String[] args) {
        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.sendNotification("Hello we have shipped your package and please share the OTP which you will get via SMS/WhatsApp communication with delivery partner.");

        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.sendNotification("Your OTP to get the package is 572347 please share with delivery partner.");

        NotificationService whatsAppNotification = new NotificationService(new WhatsAppMessaging());
        whatsAppNotification.sendNotification("Your OTP to get the package is 572347 please share with delivery partner.");
    }
}
