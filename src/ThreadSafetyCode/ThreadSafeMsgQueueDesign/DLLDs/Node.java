package ThreadSafetyCode.ThreadSafeMsgQueueDesign.DLLDs;

class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    T getData()
    {
        return data;
    }
}
