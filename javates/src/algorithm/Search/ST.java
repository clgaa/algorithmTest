package Search;

import java.util.Iterator;

public interface ST<Key, Value> {
	Value put(Key key, Value value);
	Value get(Key key);
	void delete(Key key);
	boolean contains(Key key);
	int size();
	Key min();
	Key max();
	Key floor(Key key);
	Key ceiling(Key key);
	int rank(Key key);
	Key select(int k);
	void deleteMin();
	void deleteMax();
	int size(Key lo, Key hi);
	Iterator<Key> keys(Key lo, Key hi);
	Iterator<Key> keys();
}
