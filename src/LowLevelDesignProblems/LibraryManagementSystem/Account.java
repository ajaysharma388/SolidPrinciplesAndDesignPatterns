package LowLevelDesignProblems.LibraryManagementSystem;

abstract public class Account {
    protected String id;
    protected String pwd;
    protected Person owner;
    protected AccountStatus status;
    abstract void run();
    abstract void resetPwd();
}
