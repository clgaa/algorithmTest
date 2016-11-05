package algorithm;

public class queue {
    int head;
    int tail;
    int[] a;
    public queue(int size) {
        a = new int[size];
    }
    
    public void enqueue(int data) {
        if(tail >= a.length) {
            tail = 0;
        }
        a[tail++] = data;
    }
    
    public int dequeue() {
        int data = a[head++];
        if(head >= a.length) {
            head = 0;
        }
        return data;
    }

}
