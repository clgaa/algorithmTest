package javates;

import java.util.ArrayList;

public class Combine {
    
    public static void main(String[] args) {
        String[] src = {"a", "b", "bc", "ac", "c", "ab", "abc"};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < src.length; i++) {
            for(int j = i + 1; j < src.length; j++) {
                list.add((src[i] + src[j]).hashCode());
            }
        }
        Integer[] value = new Integer[list.size()];
        list.toArray(value);
        for(int i = 0; i < value.length; i++) {
            System.out.print(value[i] + "  ");
        }
        System.out.println("");
        Combine combine = new Combine();
        
        combine.new QuickSort().sort(value, 0, value.length - 1);
        BinarySearch search = combine.new BinarySearch();
        for(int i = 0; i < src.length; i++) {
            System.out.print(src[i].hashCode());
            System.out.println("");
            if(search.search(value, src[i].hashCode())) {
                System.out.println(src[i]);
            }
        }
    }
    public class QuickSort {
        public void sort(Comparable[] a, int lo, int hi) {
            if (null == a) {
                return;
            }
            if (lo >= hi) {
                return;
            }
            int j = partition(a, lo, hi);
            sort(a, lo, j - 1);
            sort(a, j + 1, hi);
        }
        
        private int partition(Comparable[] a, int lo, int hi) {
            int j = lo;
            for(int i = lo; i < hi; i++) {
                if(a[i].compareTo(a[hi]) <= 0) {
                    swap(a, i, j++);
                }
            }
            swap(a, j, hi);
            return j;
        }
        private void swap(Comparable[] a, int i, int j) {
            Comparable temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    
    class BinarySearch {
        public boolean search(Comparable[] a, Comparable key) {
            int hi = a.length - 1;
            int low = 0;
            
            while(low <= hi) {
                int mid = (hi + low) / 2;
            if(a[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (a[mid].compareTo(key) > 0) {
                hi = mid - 1;
            } else {
                return true;
            }
            
            }
            return false;
        }
    }

}
