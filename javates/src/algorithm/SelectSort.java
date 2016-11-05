package algorithm;

public class SelectSort<T> extends BaseSort{

    @Override
    public void sort(Comparable[] a) {
        // TODO Auto-generated method stub
        for(int i = 0; i < a.length; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if(less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
    
    public static void main(String[] args) {
        SelectSort<Integer> s = new SelectSort<Integer>();
        String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        s.show(a);
        s.sort(a);
        s.show(a);
    }

}
