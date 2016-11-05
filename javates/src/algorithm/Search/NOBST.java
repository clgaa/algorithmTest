package Search;

import java.util.Iterator;

public class NOBST implements ST<Comparable, Object>{
	
	private Node root;
	class Node {
		private Comparable key;
		private Object value;
		private Node left;
		private Node right;
		public Node(Comparable key, Object value) {
			this.key = key;
			this.value = value;
		}
	}

	@Override
	public Object put(Comparable key, Object value) {
		// TODO Auto-generated method stub
		Node x = root;
		if(null == x) {
			x = new Node(key, value);
			return null;
		}
		while(true) {
		int cmp = key.compareTo(x.key);
		if(cmp < 0) {
			if(null == x.left) {
				x.left = new Node(key, value);
				return null;
			} else {
				x = x.left;
			}
		} else if(cmp == 0) {
			x.value = value;
		} else {
			if (null == x.right) {
				x.right = new Node(key, value);
				return null;
			} else {
				x = x.right;
			}
		}
		}
	
	}
	

	@Override
	public Object get(Comparable key) {
		// TODO Auto-generated method stub
		Node x = root;
		while (null != x) {
			int cmp = key.compareTo(x.key);
			if(cmp < 0) {
				x = x.left;
			} else if(cmp > 0) {
				x = x.right;
			} else {
				return x.value;
			}
		}
		return null;
	}

	@Override
	public void delete(Comparable key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Comparable key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Comparable min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comparable max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comparable floor(Comparable key) {
		// TODO Auto-generated method stub
		Node x = root;
		Node temp = null;
		while(null != x) {
			int cmp = key.compareTo(x.key);
			if (cmp < 0 ) {
				x = x.left;
			} else if(cmp > 0) {
				temp = x;
				x = x.right;
			} else {
				return x.key;
			}
		}
		if(null != temp) {
			return temp.key;
		}
		return null;
	}

	@Override
	public Comparable ceiling(Comparable key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int rank(Comparable key) {
		// TODO Auto-generated method stub
		Node x = root;
		while (null != x) {
			int cmp = key.compareTo(x.key);
			if (cmp < 0) {
				x = x.left;
			} else if(cmp == 0) {
//				return size(x.left);
			} else {
				if(null != x.right) {
					x = x.right;
				}
//				return size(x.left) + 1;
			}
		}
		return 0;
	}

	@Override
	public Comparable select(int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size(Comparable lo, Comparable hi) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Comparable> keys(Comparable lo, Comparable hi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Comparable> keys() {
		// TODO Auto-generated method stub
		return null;
	}

}
