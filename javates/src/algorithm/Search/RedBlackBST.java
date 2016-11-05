package Search;

import java.util.Iterator;

public class RedBlackBST implements ST<Comparable, Object>{
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	private class Node {
		private Comparable key;
		private Object value;
		private Node left;
		private Node right;
		private boolean color;
		int N;
		public Node(Comparable key, Object value, int N, boolean color) {
		this.key = key;
		this.value = value;
		this.N = N;
		this.color = color;
		}
	}
	
	private Node root;
	@Override
	public Object put(Comparable key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	private Node put(Comparable key, Object value, Node x) {
		if(null == x) {
			return new Node(key, value, 1, RED);
		}
		int cmp = key.compareTo(x.key);
		if(cmp < 0) {
			x.left = put(key, value, x.left);
		} else if(cmp > 0) {
			x.right = put(key, value,x.right);
		} else {
			x.value = value;
			return x;
		}
		
		if(!isRed(x.left) && isRed(x.right)) {
			x = rotateLeft(x);
		}
		if(isRed(x.left) && isRed(x.left.left)) {
			x = rotateRight(x);
		}
		if(isRed(x.left) && isRed(x.right)) {
			flipColors(x);
		}
		
		x.N = 1 + size(x.left) + size(x.right);
		
		
		return x;
	}
	
	private boolean isRed(Node x) {
		if(null == x) {
			return false;
		}
		return x.color == RED;
	}
	
	private Node rotateLeft(Node x) {
		Node temp = x.right;
		x.right = temp.left;
		temp.left = x;
		temp.color = x.color;
		temp.N = x.N;
		x.color = RED;
		x.N = 1 + size(x.left) + size(x.right);
		return temp;
	}
	
	private Node rotateRight(Node x) {
		Node temp = x.left;
		x.left = temp.right;
		temp.right = x;
		temp.color = x.color;
		x.color = RED;
		temp.N = x.N;
		x.N = 1 + size(x.left) + size(x.right);
		return temp;
	}
	
	private void flipColors(Node x) {
		if(null == x || null == x.left || null == x.right) {
			return;
		}
		x.left.color = BLACK;
		x.right.color = BLACK;
		x.color = RED;
	}
	@Override
	public Object get(Comparable key) {
		// TODO Auto-generated method stub
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
