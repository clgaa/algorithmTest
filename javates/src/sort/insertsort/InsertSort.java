package sort.insertsort;

class InsertSort {
    int[] a = {8, 4, 7, 1, 6, 9};
    int i = 0;
    int key;
    
    private void printSort(int[] a) {
        for(int num = 0; num < a.length; num++) {
            System.out.print(a[num]);
        }
        System.out.println("");
    }
    public void insertSort() {
        printSort(a);
        for(int j = 1; j < a.length; j++) {
            key = a[j];
            i = j - 1;
            while(i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
        printSort(a);
        
    }
    
    public void sortSmall() {
        printSort(a);
        for(int j = 1; j < a.length; j++) {
            key = a[j];
            i = j - 1;
            while(i >= 0 && a[i] < key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
        printSort(a);
    }
    
    public void add() {
        int[] num1 = {1, 0, 1, 0, 1, 1};
        int[] num2 = {1, 1, 1, 0, 0, 1};
        int[] num3 = {0, 0, 0, 0, 0, 0, 0};
        int key = 0;
        int result;
        printSort(num1);
        printSort(num2);
        for(int i = 0; i < num1.length; i++) {
            result = num1[i] + num2[i] + key;
    
            key = result / 2;
            num3[i] = result % 2;
           
        }
        num3[num1.length] = key;
        printSort(num3);
    }

    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
//        sort.insertSort();
//        sort.sortSmall();
        sort.add();
    }
    
    
}
