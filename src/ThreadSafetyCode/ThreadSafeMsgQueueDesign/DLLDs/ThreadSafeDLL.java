package ThreadSafetyCode.ThreadSafeMsgQueueDesign.DLLDs;

public class ThreadSafeDLL<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private final Object headLock;
    private final Object tailLock;

    public ThreadSafeDLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.tailLock = new Object();
        this.headLock = new Object();
    }

    public void insertAtTail(T data) {
        synchronized (tailLock) {
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

    public T removeAtHead() {
        synchronized (headLock) {
            if (head == null) {
                return null;
            }
            Node<T> ptr = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            else {
                head.prev = null;
            }
            this.size--;
            return ptr.data;
        }
    }
}