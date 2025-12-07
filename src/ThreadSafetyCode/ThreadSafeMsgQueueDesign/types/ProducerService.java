package ThreadSafetyCode.ThreadSafeMsgQueueDesign.types;

import ThreadSafetyCode.ThreadSafeMsgQueueDesign.DLLDs.ThreadSafeDLL;

public interface ProducerService {
    String getTemplate();
    void sendNotification(Notification notification, ThreadSafeDLL<Notification> stream);
}
