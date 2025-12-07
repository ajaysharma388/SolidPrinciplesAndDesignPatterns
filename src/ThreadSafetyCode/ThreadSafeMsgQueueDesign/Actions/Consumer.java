package ThreadSafetyCode.ThreadSafeMsgQueueDesign.Actions;

import ThreadSafetyCode.ThreadSafeMsgQueueDesign.DLLDs.ThreadSafeDLL;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.types.ConsumerService;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.types.Notification;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.types.User;

public class Consumer implements ConsumerService {
    private final User user;

    public Consumer(String name, String email) {
        this.user = new User(name, email);
    }

    public String getUser() {
        return this.user.getUser_email() + "\n" + this.user.getUser_name();
    }

    @Override
    public Notification receiveNotification(ThreadSafeDLL<Notification> stream) {
        return stream.removeAtHead();
    }
}

