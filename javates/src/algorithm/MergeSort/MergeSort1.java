package MergeSort;

public class MergeSort1 {
	Comparable[] temp;
	private void merge(Comparable[] a, int p, int mid, int q) {
		temp = new Comparable[q - p + 1];
		int j = p;
		for(int i = 0; i < q - p + 1 ; i++) {
			temp[i] = a[j++];
		}
		
		int m = p - p;
		int n = mid + 1 - p;
		for(int i = p; i <= q; i++) {
			if(m > mid - p) {
				a[i] = temp[n++];
			} else if(n > q - p) {
				a[i] = temp[m++];
			} else if(temp[m].compareTo(temp[n]) < 0) {
				a[i] = temp[m++];
			} else {
				a[i] = temp[n++];
			}
		}
	}
	
	public void sort(Comparable[] a, int p, int q) {
		if(p >= q) {
			return;
		}
		int mid1 = p + (q - p) / 2;
		sort(a, p, mid1);
		sort(a, mid1 + 1, q);
		merge(a, p, mid1, q);
	}
	
	public static void main(String[] args) {
		Integer[] a = {1, 2, 5, 4, 9, 3};
		MergeSort1 s = new MergeSort1();
		s.sort(a, 0, a.length - 1);
		for(int i = 0; i < a.length; i++) {
			System.out.print("" + a[i]);
		}
	}

}
