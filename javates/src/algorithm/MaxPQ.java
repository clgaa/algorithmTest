package algorithm;

public class MaxPQ<key extends Comparable<key>> extends BaseSort{

    private key[] pq;
    private int N = 0;
    @Override
    public void sort(Comparable[] a) {
        // TODO Auto-generated method stub
        
    }
    
    public MaxPQ(int maxN) {
        pq = (key[])(new Comparable[maxN]);
    }
    public boolean isEmpty() {
        return N == 0;
    }
    
    public int size() {
        return N;
    }
    
    public void insert(key v) {
        pq[N++] = v;
        swim(v);
    }
    
    public key delete() {
        key max = pq[1];
        exch(pq, 1, N--);
        pq[N + 1] = null;
        sink(1);
        return max;
    }
    
    public void sink(int k) {
        while(2 * k <= N) {
            int j = 2 * k;
            if(j < N && less(pq[j], pq[j + 1])) {
                j++;
            }
            if(less(pq[k], pq[j])) {
                exch(pq, k, j);
                k = j;
            } else{
                break;
            }
        }
    }
    
    public void swim(key v) {
        int pos = N;
        while(pos > 1) {
            if(less(pq[pos], pq[pos / 2])) {
                exch(pq, pos, pos / 2); 
                pos = pos / 2;
            } else {
                break;
            }
        }
    }

    
}
