package ThreadSafetyCode.ThreadSafeMsgQueueDesign.Notifications;

import ThreadSafetyCode.ThreadSafeMsgQueueDesign.DLLDs.ThreadSafeDLL;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.types.Notification;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.types.ProducerService;

public class PushProducer implements ProducerService {
    private final String template;

    public PushProducer() {
        this.template = "Push Update::";
    }

    public String getTemplate() {
        return template;
    }

    public void sendNotification(Notification notification, ThreadSafeDLL<Notification> stream) {
        stream.insertAtTail(notification);
    }
}