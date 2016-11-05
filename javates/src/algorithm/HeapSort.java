package algorithm;

public class HeapSort extends BaseSort{

    @Override
    public void sort(Comparable[] b) {
        // TODO Auto-generated method stub
        int N = b.length;
        Comparable[] a = new Comparable[N + 1];
        a[0] = 1000;
        for(int j = 1; j < N + 1; j++) {
            a[j] = b[j - 1];
        }
        for(int k = N / 2; k > 0; k--) {
            sink(a, k, N);
        }
        int m = N;
        while(m > 1) {
            exch(a, m, 1);
            sink(a, 1, --m);
        }
        
        for(Comparable i : a) {
            System.out.print(i + "");
        }
    }
    
    private void sink(Comparable[] a, int k, int N) {
        while(2 * k <= N) {
            int j = 2 * k;
            if(j < N && less(a[j], a[j + 1])) {
                j++;
            }
            if(less(a[k], a[j])) {
                exch(a, j, k);
                k = j;
            } else {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Integer[] a = {5, 4, 7, 1, 8};
        HeapSort sort = new HeapSort();
        sort.sort(a);
//        for(int i : a) {
//            System.out.print(i + "");
//        }
    }

}
