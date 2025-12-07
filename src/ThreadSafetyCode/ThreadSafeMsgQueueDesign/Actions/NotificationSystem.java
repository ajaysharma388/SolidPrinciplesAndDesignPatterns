package ThreadSafetyCode.ThreadSafeMsgQueueDesign.Actions;

import ThreadSafetyCode.ThreadSafeMsgQueueDesign.DLLDs.ThreadSafeDLL;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.types.Notification;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.types.ProducerService;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.types.User;

import java.util.ArrayList;

public class NotificationSystem {
    private final Consumer consumer;
    private final ArrayList<ProducerService> producers;
    private final ThreadSafeDLL<Notification> stream;

    public NotificationSystem(Consumer consumer) {
        this.consumer = consumer;
        this.producers = new ArrayList<>();
        this.stream = new ThreadSafeDLL<>();
    }

    public void addProducer(ProducerService producer) {
        producers.add(producer);
    }

    public void removeProducer(ProducerService producer) {
        producers.remove(producer);
    }

    public void sendEvent() {
        for(int order = 0; order < 3; order++) {
            String[] message = {"Your order is out for delivery", "Your OTP is 123456 kindly share it at time of delivery", "Hurray! you have received your order."};
            int id = 3 * order+1;
            for( String msg : message ) {
                for (ProducerService service : this.producers) {
                    service.sendNotification(
                        new Notification(
                                service.getTemplate() + msg,
                                new User("Lets Eat", "cafeindia@letseat.com"),
                                new User("USER_" + order, "ajaysm" + order + "@yahoo.in"),
                                id
                        ), stream
                    );
                    id++;
                }
            }
        }
    }

    public String seeNotifications() {
        Notification notification = consumer.receiveNotification(stream);
        if(notification != null) {
            return notification.serialize();
        }
        return "Empty Data\n";
    }
}