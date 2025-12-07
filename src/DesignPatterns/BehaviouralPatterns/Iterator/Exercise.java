package DesignPatterns.BehaviouralPatterns.Iterator;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NotificationManager notificationManager = new NotificationManager();

        // Add Notifications
        for(int i=0;i < 2;i++) {
            String emailNotification = sc.nextLine();
            String smsNotification = sc.nextLine();
            String pushNotification = sc.nextLine();

            notificationManager.addEmailNotification(emailNotification);
            notificationManager.addSMSNotification(smsNotification);
            notificationManager.addPushNotification(pushNotification);
        }
        notificationManager.printAllNotifications();
        sc.close();
    }
}