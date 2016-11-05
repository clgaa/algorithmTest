package algorithm;

public class Insert1Sort extends BaseSort{

    @Override
    public void sort(Comparable[] a) {
        for(int i = 1; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if(less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    
    public void sort1(Comparable[] a) {
        for(int i = 1; i < a.length; i++) {
            Comparable key = a[i];
            int j = i - 1;
            for(; j >= 0; j++) {
                if(a[j].compareTo(key) > 0) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        Insert1Sort sort = new Insert1Sort();
        sort.show(a);
        sort.sort(a);
        sort.show(a);
    }
    
    

}
