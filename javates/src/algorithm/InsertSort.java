package algorithm;

import java.util.ArrayList;

public class InsertSort {

    public void sortBig(ArrayList<Integer> data) {
        if(null == data || data.size() <= 0) {
            return;
        }
        for(int i = 1; i < data.size(); i++) {
            int temp = data.get(i);
            int j = i - 1;
            for(; j >= 0; j--) {
                if(temp < data.get(j)) {
                    data.set(j + 1, data.get(j));
                } else {
                    break;
                }
            }
            data.set(j + 1, temp);
        }
    }
    
    public void sortSmall(ArrayList<Integer> data) {
        if(null == data || data.size() <= 0) {
            return;
        }
        for(int i = 1; i < data.size(); i++) {
            int temp = data.get(i);
            int j = i - 1;
            for(; j >= 0; j--) {
                if(data.get(j) < temp) {
                    data.set(j + 1, data.get(j));
                } else {
                    break;
                }
            }
            data.set(j + 1, temp);
        }
    }
    
    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(4);
        data.add(100);
        data.add(55);
        data.add(23);
        data.add(66);
        System.out.println(data.toString());
        sort.sortBig(data);
        System.out.println(data.toString());
        sort.sortSmall(data);
        System.out.println(data);
    }
    
    
}
