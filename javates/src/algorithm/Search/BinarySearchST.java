package Search;

import java.util.Iterator;

public class BinarySearchST implements ST<Comparable, Object>{
	private Comparable[] keys;
	private Object[] values;
	private int N;

	public BinarySearchST(int capacity) {
		keys = new Comparable[capacity];
		values = new Object[capacity];
	}
	
	@Override
	public Object put(Comparable key, Object value) {
		// TODO Auto-generated method stub
		int i = rank(key);
		if(key.equals(keys[i])) {
			values[i] = value;
			return null;
		}
		for(int j = N++; j > i; j--) {
			keys[j] = keys[j - 1];
			values[j] = values[j - 1];
		}
		keys[i] = key;
		values[i] = value;
		return null;
	}

	@Override
	public Object get(Comparable key) {
		// TODO Auto-generated method stub
		int i = rank(key);
		if(key.equals(keys[i])) {
			return values[i];
		}
		return null;
	}

	@Override
	public void delete(Comparable key) {
		// TODO Auto-generated method stub
		int i = rank(key);
		if(key.equals(keys[i])) {
			for(int j = i + 1; j < N; j++) {
				keys[j - 1] = keys[j];
				values[j - 1] = keys[j];
			}
			keys[N - 1] = null;
			values[N - 1] = null;
			N--;
		}
		
	}

	@Override
	public boolean contains(Comparable key) {
		// TODO Auto-generated method stub
		int i = rank(key);
		if(keys[i].equals(key)) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return N;
	}

	@Override
	public Comparable min() {
		// TODO Auto-generated method stub
		return keys[0];
	}

	@Override
	public Comparable max() {
		// TODO Auto-generated method stub
		return keys[N - 1];
	}

	@Override
	public Comparable floor(Comparable key) {
		// TODO Auto-generated method stub
		int i = rank(key);
		if(key.equals(keys[i])) {
			return key;
		} else {
			return keys[i];
		}
	}

	@Override
	public Comparable ceiling(Comparable key) {
		// TODO Auto-generated method stub
		int i = rank(key);
		return keys[i];
	}

	@Override
	public int rank(Comparable key) {
		// TODO Auto-generated method stub
		if(null != keys) {
			int lo = 0;
			int hi = N - 1;
			while(lo <= hi) {
				int mid = lo + (hi - lo) / 2;
				if(keys[mid].compareTo(key) < 0) {
					lo = mid + 1;
				} else if(keys[mid].compareTo(key) > 0) {
					hi = mid - 1;
				} else {
					return mid;
				}
			}
			return lo;
		}
		return 0;
	}

	@Override
	public Comparable select(int k) {
		// TODO Auto-generated method stub
		if(k < N) {
			return keys[k];
		}
		return null;
	}

	@Override
	public void deleteMin() {
		// TODO Auto-generated method stub
		for(int i = 1; i < N; i++) {
			keys[i - 1] = keys[i];
			values[i - 1] = values[i];
		}
		keys[N - 1] = null;
		values[N - 1] = null;
		N--;
	}

	@Override
	public void deleteMax() {
		// TODO Auto-generated method stub
		if(N > 0) {
		keys[N - 1] = null;
		values[N - 1] = null;
		}
	}

	@Override
	public int size(Comparable lo, Comparable hi) {
		// TODO Auto-generated method stub
		if(hi.compareTo(lo) < 0) {
			return 0;
		}
		int l = rank(lo);
		int h = rank(hi);
		if(hi.equals(keys[h])) {
			h++;
		}
		return h - l;
	}

	@Override
	public Iterator<Comparable> keys(Comparable lo, Comparable hi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Comparable> keys() {
		// TODO Auto-generated method stub
		return new STIterator();
	}

	class STIterator implements Iterator<Comparable> {
		int i = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i < N;
		}

		@Override
		public Comparable next() {
			// TODO Auto-generated method stub
			return keys[i++];
		}
		
	}
	public static void main(String[] args) {
		BinarySearchST st = new BinarySearchST(100);
		st.put("3", "3");
		st.put("1", "1");
		
		st.put("4", "4");
		Iterator<Comparable> it = st.keys();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		System.out.println(st.get("4"));
		st.delete("3");
		Iterator<Comparable> it1 = st.keys();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
