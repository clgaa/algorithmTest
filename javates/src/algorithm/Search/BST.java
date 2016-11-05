package Search;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

public class BST implements ST<Comparable, Object>{

	private Node root;
	class Node{
		private Comparable key;
		private Object value;
		private Node left;
		private Node right;
		private int N;
		public Node(Comparable key, Object value, int N) {
			this.key = key;
			this.value = value;
			this.N = N;
		}
	}
	@Override
	public Object put(Comparable key, Object value) {
		// TODO Auto-generated method stub
		return put(root, key, value);
	}

	private Node put(Node x, Comparable key, Object value) {
		if(null == x) {
			return new Node(key, value, 1);
		}
		if(key.compareTo(x.key) < 0) {
			x.left = put(x.left, key, value);
		} else if(key.compareTo(x.key) > 0) {
			x.right = put(x.right, key, value);
		} else {
			x.value = value;
		}
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}
	@Override
	public Object get(Comparable key) {
		// TODO Auto-generated method stub
		return get(root, key);
	}
	
	private Object get(Node x, Comparable key) {
		if(null == x) {
			return null;
		}
		if(key.compareTo(x.key) < 0) {
			return get(x.left, key);
		} else if(key.compareTo(x.key) > 0) {
			return get(x.right, key);
		} else {
			return x.value;
		}
	}

	@Override
	public void delete(Comparable key) {
		// TODO Auto-generated method stub
		
	}
	
	private void delete(Node x, Comparable key) {
		if(null == x) {
			return;
		}
		int cmp = key.compareTo(x.key);
		if(cmp == 0) {
			
			if(null == x.left) {
				x = x.right;
				x.N = size(x.left) + size(x.right) + 1;
				return;
			} else if(null == x.right) {
				x = x.left;
				x.N = size(x.left) + size(x.right) + 1;
				return;
			}
			
			Node t = min(x.right);
			t.left = x.left;
			t.right = deleteMin(x.right);
			x = t;
			x.N = size(x.left) + size(x.right) + 1;
		} else if(cmp > 0) {
			delete(x.right, key);
		} else {
			delete(x.left, key);
		}
	}

	@Override
	public boolean contains(Comparable key) {
		// TODO Auto-generated method stub
		return contains(root, key);
	}
	
	private boolean contains(Node x, Comparable key) {
		if(null == x) {
			return false;
		}
		int cmp = key.compareTo(x.key);
		if(cmp == 0) {
			return true;
		} else if(cmp > 0){
			return contains(x.right, key);
		} else {
			return contains(x.left, key);
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int size(Node x) {
		// TODO Auto-generated method stub
		if(null == x) {
			return 0;
		}
		return size(x.left) + size(x.right) + 1;
	}

	@Override
	public Comparable min() {
		// TODO Auto-generated method stub
		return min(root).key;
	}
	
	public Node min(Node x) {
		if(null == x) {
			return null;
		}
		if(null == x.left) {
			return x;
		} else {
			return min(x.left);
		}
	}

	@Override
	public Comparable max() {
		// TODO Auto-generated method stub
		return max(root);
	}
	
	private Comparable max(Node x) {
		if(null == x) {
			return null;
		}
		if(null == x.right) {
			return x.key;
		} else {
			return max(x);
		}
	}

	@Override
	public Comparable floor(Comparable key) {
		// TODO Auto-generated method stub)

		return floor(root, key);
	}

	private Comparable floor(Node x, Comparable key) {
		if(null == x) {
			return null;
		}
		if(key.compareTo(x.key) < 0) {
			return floor(x.left, key);
		} else if(key.compareTo(x.key) == 0) {
			return x.key;
		} else {
			Comparable key1 = floor(x.right, key);
			if(null != key1) {
				return key1;
			} else {
				return x.key;
			}
		}
	}
	@Override
	public Comparable ceiling(Comparable key) {
		// TODO Auto-generated method stub
		return ceiling(root, key);
	}

	private Comparable ceiling(Node x, Comparable key) {
		if(null == x) {
			return null;
		}
		int cmp = key.compareTo(x.key);
		if(cmp > 0) {
			return ceiling(x.right, key);
		} else if(cmp == 0) {
			return x.key;
		} else {
			Comparable key1 = ceiling(x.left, key);
			if(null != key1) {
				return key1;
			} else {
				return x.key;
			}
		}
	}
	@Override
	public int rank(Comparable key) {
		// TODO Auto-generated method stub
		return rank(root, key);
	}

	private int rank(Node x, Comparable key) {
		if(null == x) {
			return 0;
		}
		int cmp = key.compareTo(x.key);
		if(cmp == 0) {
			return size(x.left);
		} else if(cmp < 0) {
			return rank(x.left, key);
		} else {
			return size(x.left) + 1 + rank(x.right, key);
		}
	}
	@Override
	public Comparable select(int k) {
		// TODO Auto-generated method stub
		return select(root, k);
	}

	private Comparable select(Node x, int k) {
		if(null == x) {
			return null;
		}
		int num = size(x.left);
		if(num == k) {
			return x.key;
		} else if(num < k) {
			return select(x.right, k - num - 1);
		} else {
			return select(x.left, k);
		}
	}
	@Override
	public void deleteMin() {
		// TODO Auto-generated method stub
		root = deleteMin(root);
	}
	
	private Node deleteMin(Node x) {
		if(null == x.left) return x.right;
		x.left = deleteMin(x.left);
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}

	@Override
	public void deleteMax() {
		// TODO Auto-generated method stub
		root = deleteMax(root);
	}
	
	private Node deleteMax(Node x) {
		if(null == x.right) return x.left;
		x.right = deleteMax(x.right);
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}

	@Override
	public int size(Comparable lo, Comparable hi) {
		// TODO Auto-generated method stub
		int num = rank(hi) - rank(lo);
		if(contains(hi)) {
			num++;
		}
		return num;
	}

	@Override
	public Iterator<Comparable> keys(Comparable lo, Comparable hi) {
		// TODO Auto-generated method stub
		ArrayList<Comparable> list = new ArrayList();
		
		return null;
	}

	private void keys(Node x, ArrayList list, Comparable lo, Comparable hi) {
		if(null == x) {
			return;
		}
		int locmp = lo.compareTo(x.key);
		int hicmp = hi.compareTo(x.key);
		if(locmp < 0) keys(x.left, list, lo, hi);
		if(locmp <= 0 &&  hicmp>= 0) {
			list.add(x.key);
		}
		if(hicmp > 0) keys(x.right, list , lo, hi);
	}
	
	@Override
	public Iterator<Comparable> keys() {
		// TODO Auto-generated method stub
		return keys(max(root), max(root));
	}

}
