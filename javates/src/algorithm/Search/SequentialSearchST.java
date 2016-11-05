package Search;

import java.util.Iterator;

public class SequentialSearchST implements ST<String, String>{
	private Node first;
	class Node {
		String key;
		String value;
		Node next;
		public Node(String key, String value, Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	@Override
	public String put(String key, String value) {
		// TODO Auto-generated method stub
		Node temp  = first;
		while(null != temp) {
			if(key.equals(temp.key)) {
				String result = temp.value;
				temp.value = value;
				return result;
			}
			temp = temp.next;
		}
		first = new Node(key, value, temp);
		return null;
	}

	@Override
	public String get(String key) {
		// TODO Auto-generated method stub
		Node temp = first;
		while(null != temp) {
			if(key.equals(temp.key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String floor(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ceiling(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int rank(String key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String select(int k) {
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
	public int size(String lo, String hi) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<String> keys(String lo, String hi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<String> keys() {
		// TODO Auto-generated method stub
		return null;
	}

}
