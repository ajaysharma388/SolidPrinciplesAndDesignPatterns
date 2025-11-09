package SolidPrinciples.DependencyInversionPrinciple.BadExample;


public class CommunicationSystem {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendEmailNotification("Hello we have shipped your package and please share the OTP which you will get via SMS/WhatsApp communication with delivery partner.");
        notificationService.sendSMSNotification("Your OTP to get the package is 572347 please share with delivery partner.");
        // this is pretty bad design as if we wanted to extend the functionality of the system and add more communication
        // channel than we have to make so many updates in the code as our code is pretty tightly coupled
        // in the same parent package we have added another packages where I have added an alternative and better approach
        // to achieve the same functionality without doing so much alteration by using the Dependency inversion Solid Principle.
    }
}
