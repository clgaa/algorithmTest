package Graph;

import java.util.Iterator;

public class Bag<K> implements Iterable<K>{
	private Node first;
	class Node {
		K value;
		Node next;
		public Node(K value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	public void put(K k) {
		Node temp = first;
		while(null !=temp) {
			if(k == temp.value) {
				return;
			}
			temp = temp.next;
		}
		first = new Node(k, first);
	}

	@Override
	public Iterator<K> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	class ListIterator implements Iterator<K> {

		private Node currentNode = first;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentNode != null;
		}

		@Override
		public K next() {
			// TODO Auto-generated method stub
			K k = currentNode.value;
			currentNode = currentNode.next;
			return k;
		}
		
	}
}
