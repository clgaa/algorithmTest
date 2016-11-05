package algorithm;

import java.util.Iterator;

public class FixCapacityStack<item> implements Iterable<item>{

    private item[] a;
    private int N = 0;
    public FixCapacityStack(int size) {
        a = (item[]) new Object[size];
    }
    
    public void push(item data) {
        if(N == a.length) resize(a.length * 2);
        a[N++] = data;
    }
    
    public item pop() {
        item i = a[--N];
        a[N] = null;
        if(N > 0 && N == a.length / 4) resize(a.length / 2);
        return i;
    }
    
    public int size() {
        return N;
    }
    
    public boolean isEmpty() {
        return N == 0;
    }
    
    private void resize(int max) {
        item[] temp = (item[]) new Object[max];
        for(int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    @Override
    public Iterator<item> iterator() {
        // TODO Auto-generated method stub
        return new ReverseArrayIterator();
    }
    
    private class ReverseArrayIterator implements Iterator<item> {
        int i = N;
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return i > 0;
        }

        @Override
        public item next() {
            // TODO Auto-generated method stub
            return a[--i];
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub
            
        }
        
    }
}
