package ThreadSafetyCode.ThreadSafeMsgQueueDesign.types;

public class User {
    private final String user_name;
    private final String user_email;
    public User(String user_name, String user_email) {
        this.user_name = user_name;
        this.user_email = user_email;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_email() {
        return user_email;
    }
}
