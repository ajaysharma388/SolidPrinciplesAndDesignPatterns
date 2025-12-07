package ThreadSafetyCode.ThreadSafeMsgQueueDesign.types;

public class Notification {
    private String message;
    private User sender;
    private User receiver;
    private final int id;

    public Notification(String message, User sender, User receiver,  int id) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.id = id;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public String serialize() {
        return "\nSending the Notification "+ id +"\n\tSender Name: " + sender.getUser_name() +
                ", Sender Email: " + sender.getUser_email() + "\n\tReceiver: " + receiver.getUser_name() +
                ", Receiver Email: " + sender.getUser_email() + "\n\tMessage: " + message;
    }
}
