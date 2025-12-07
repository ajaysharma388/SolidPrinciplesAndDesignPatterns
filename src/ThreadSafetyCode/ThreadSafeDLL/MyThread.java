package ThreadSafetyCode.ThreadSafeDLL;

public class MyThread extends Thread {
    private final int cnt;
    private final ThreadSafeDLL<Integer> my_list;

    public MyThread(int n, ThreadSafeDLL<Integer> list) {
        this.cnt = n;
        this.my_list = list;
    }

    public void run() {
        for (int i = 1; i <= this.cnt; i++) {
            my_list.insertAtHead(i);
            my_list.print();
        }
    }
}
