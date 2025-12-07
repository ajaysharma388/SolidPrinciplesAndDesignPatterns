package ThreadSafetyCode.ThreadSafeDLL;

public class Exercise {
    public static void main(String[] args) {
        ThreadSafeDLL<Integer> list = new ThreadSafeDLL<>();
        MyThread myThread1 = new MyThread(10, list);
        MyThread myThread2 = new MyThread(20, list);
        myThread1.start();
        myThread2.start();
        System.out.println("Completed The Thread Execution");
        list.print();
        System.out.println("Completed The Main");
    }
}
