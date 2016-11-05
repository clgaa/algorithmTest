package algorithm;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    public Node<T> first;
    private int N;
   
    public void push(T t) {
        Node oldFirst = first;
        first = new Node();
        first.data = t;
        first.next = oldFirst;
        N++;
    }
    
    public T pop() {
        T t = first.data;
        first = first.next;
        N--;
        return t;
    }
    
    public int getSize() {
        return N;
    }
    
    public boolean isEmpty() {
        return N == 0;
    }


    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new StackIterator();
    }
    
    private class StackIterator implements Iterator<T> {

        private Node<T> current = first;
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return current != null;
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            T t = current.data;
            current = current.next;
            return t;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub
            
        }
        
    }
    
}
