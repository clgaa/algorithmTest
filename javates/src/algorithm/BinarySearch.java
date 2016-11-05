package algorithm;

import java.util.Arrays;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        if(null == a) {
            return -1;
        }
        int hi = a.length;
        int lo = 0;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(key > a[mid]) lo = mid + 1;
            else if(key < a[mid]) hi = mid - 1;
            else return mid;
        }
        return -1;
    }
    
    public void deleteSame(int[] a, int num) {
        int lo = 0;
        int hi = a.length;
        int key = a[num];
        
        for(int i = num - 1; i >= 0; i--) {
            if(a[i] == key) {
                System.out.println("" + i);
                continue;
            }
            break;
        }
        
        for(int i = num + 1; i <= hi; i++) {
            if(a[i] == key) {
                System.out.println("" + i);
                continue;
            }
            break;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,4,4,6,9};
        Arrays.sort(a);
        BinarySearch search = new BinarySearch();
        int num = search.rank(4, a);
        System.out.println("num = " + num);
        search.deleteSame(a, num);
        
    }
}
