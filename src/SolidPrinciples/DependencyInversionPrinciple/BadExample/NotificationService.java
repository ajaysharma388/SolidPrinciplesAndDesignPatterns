package SolidPrinciples.DependencyInversionPrinciple.BadExample;

public class NotificationService {
    private final EmailService emailService;
    private final SMSService smsService;
    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void sendEmailNotification(String message) {
        this.emailService.sendNotification(message);
    }

    public void sendSMSNotification(String message) {
        this.smsService.sendNotification(message);
    }
}
