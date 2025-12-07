package ThreadSafetyCode.ThreadSafeDLL;

public class ThreadSafeDLL<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private final Object lock;

    public ThreadSafeDLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.lock = new Object();
    }

    void insertAtTail(T data) {
        synchronized (lock) {
            Node<T> node = new Node<T>(data);
            if (head == null) {
                head = node;
            }
            else {
                tail.next = node;
                node.prev = tail;
            }
            tail = node;
            this.size++;
        }
    }

    void insertAtHead(T data) {
        synchronized (lock) {
            Node<T> newNode = new Node<T>(data);
            if (head == null) {
                this.head = newNode;
                this.tail = this.head;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            this.size++;
        }
    }

    void removeAtHead() {
        synchronized (lock) {
            if (head == null) {
                return;
            } else {
                head = head.next;
                head.prev = null;
            }
            this.size--;
        }
    }

    void removeAtTail() {
        synchronized (lock) {
            if (head == null) {
                return;
            } else {
                tail = tail.prev;
                if (tail == null) {
                    head = null;
                } else {
                    tail.next = null;
                }
                this.size--;
            }
        }
    }

    void print() {
        synchronized (lock) {
            Node<T> ptr = this.head;
            while (ptr != null) {
                System.out.print(ptr.data + " ");
                ptr = ptr.next;
            }
        }
        System.out.println();
    }
}


