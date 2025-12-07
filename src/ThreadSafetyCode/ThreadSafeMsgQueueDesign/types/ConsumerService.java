package ThreadSafetyCode.ThreadSafeMsgQueueDesign.types;

import ThreadSafetyCode.ThreadSafeMsgQueueDesign.DLLDs.ThreadSafeDLL;

public interface ConsumerService {
    Notification receiveNotification(ThreadSafeDLL<Notification> stream);
}
