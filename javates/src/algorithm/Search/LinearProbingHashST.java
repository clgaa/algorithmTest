package Search;

public class LinearProbingHashST<Key, Value> {

	public int N;
	private int M = 16;
	public Key[] keys;
	public Value[] values;
	public LinearProbingHashST(int M) {
		keys = (Key[]) new Object[M];
		values = (Value[]) new Object[M];
		this.M = M;
	}
	private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	
	public void put(Key key, Value value) {
		if(N > M / 2) {
			reSize(M * 2);
		}
		int i;
		for(i = hash(key); keys[i] !=null; i = (i + 1) % M) {
			if(keys[i] == key) {
				values[i] = value;
				return;
			}
		}
		keys[i] = key;
		values[i] = value;
		N++;
	}
	
	public Value get(Key key) {
		int i = hash(key);
		for(; keys[i] != null; i = (i + 1) % M) {
			if(key == keys[i]) {
				return values[i];
			}
		}
		return null;
	}
	
	private void reSize(int n) {
		LinearProbingHashST<Key, Value> t;
		t = new LinearProbingHashST<Key, Value>(n);
		for(int i = 0; i < M; i++) {
			if(null != keys[i]) {
				t.put(keys[i], values[i]);
			}
		}
		keys = t.keys;
		values = t.values;
		M = t.M;
	}
	
	public void delete(Key key) {
		if(!contains(key)) {
			return;
		}
		int i;
		for(i = hash(key); keys[i] != null; i = (i + 1) % M) {
			if(key == keys[i]) {
				keys[i] = null;
				values[i] = null;
				break;
			}
		}
		i = (i + 1) % M;
		while(keys[i] != null) {
			Key k = keys[i];
			Value v = values[i];
			keys[i] = null;
			values[i] = null;
			put(k, v);
			i = (i + 1) % M;
		}
		N--;
		if(N > 0 && N == M / 8) {
			reSize(M / 2);
		}
	}
	
	public boolean contains(Key key) {
		if(null == get(key)) {
			return false;
		}
		return true;
	}
}
