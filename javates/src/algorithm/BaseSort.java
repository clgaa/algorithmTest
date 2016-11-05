package algorithm;

public abstract class BaseSort {
    public boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
    
    public void exch(Comparable a[], int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    public void show(Comparable a[]) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    
    public boolean isSorted(Comparable a[]) {
        int i = 1;
        while(i < a.length) {
            if(less(a[i - 1], a[i])) {
                i++;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    
    public abstract void sort(Comparable[] a);
}
