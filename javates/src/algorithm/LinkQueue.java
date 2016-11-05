package algorithm;

public class LinkQueue<T>{
    private Node head;
    private Node tail;
    private class Node {
        T data;
        Node next;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    public void enqueue(T t) {
        Node oldtail = tail;
        tail = new Node();
        tail.data = t;
        tail.next = null;
        
        if(isEmpty()) head = tail;
        else oldtail.next = tail;
    }
    
    public T dequeue() {
        T t = head.data;
        head = head.next;
        if(isEmpty()) tail = head;
        return t;
    }

}
