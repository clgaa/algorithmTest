package QuickSort;

public class QuickSort {

	public void sort(Comparable[] a, int lo, int hi) {
		if(lo >= hi) {
			return;
		}
		int i = portition(a, lo, hi);
		sort(a, lo, i - 1);
		sort(a, i + 1, hi);
	}
	
	private int portition(Comparable[] a, int lo, int hi) {
		Comparable key = a[hi];
		int j = 0;
		for(int i = 0; i < hi; i++) {
			if(a[i].compareTo(key) < 0) {
				swap(a, j++, i);
			}
		}
		swap(a, j, hi);
		return j;
	}
	
	private void swap(Comparable[] a, int i , int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		Integer[] a = {2,1};
		sort.sort(a, 0, a.length - 1);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
