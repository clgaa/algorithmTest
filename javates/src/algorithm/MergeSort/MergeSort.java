package MergeSort;

public class MergeSort {
	int[] temp;
	public void merge(int[] a, int q) {
		temp = new int[a.length];
		for(int i = 0; i < a.length; i++ ) {
			temp[i] = a[i];
		}
		int m = 0;
		int n = q + 1;
		for(int i = 0; i < a.length; i++) {
			if(m > q) {
				a[i] = temp[n++];
			} else if(n >= a.length) {
				a[i] = temp[m++];
			} else if( temp[m] > temp[n]) {
				a[i] = temp[n++];
			} else {
				a[i] = temp[m++];
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] a = {6,7,8,1,2,3};
		MergeSort sort = new MergeSort();
		sort.merge(a, 2);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
