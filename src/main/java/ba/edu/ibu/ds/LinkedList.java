package ba.edu.ibu.ds;

import java.util.Iterator;

public class LinkedList implements Iterable<String>{
	
	private Node first;
	
	private int counter = 0;
	
	public void add(String item) {
		if (first == null) {
			// create element
			first = new Node(item);
		}else {
			// position and enter element
			Node current = first;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node(item));
		}
		counter++;
	}
	public String remove(int index) {
		if (index == 0) {
			String value = first.getItem();
			first = first.getNext();
			counter--;
			return value;
		}
		
		Node current = first;
		int i = 0;
		while(current.getNext() != null) {
			i++;
			if (i == index) break;
			current = current.getNext();
		}
		String value = current.getNext().getItem();
		current.setNext(current.getNext().getNext());
		counter--;
		return value;
	}
	public String removeLast() throws Exception {
		if (counter == 0) throw new Exception("List is empty dude");
		
		if (counter == 1) {
			String value = first.getItem();
			first = null;
			counter--;
			return value;
		}
		Node current = first;
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		String value = current.getNext().getItem();
		current.setNext(null);
		counter--;
		return value;
	}
	
	public String getLast() {
		Node current = first;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		return current.getItem();
	}
	
	public int size() {
		return counter;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for(String item : this) {
			sb.append(item).append(",");
		}
		sb.setLength(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}
	public Iterator<String> iterator() {
		//return new LinkedListIterator(first);
		return new Iterator<String>() {
			private Node current = first;

			public boolean hasNext() {
				return current.getNext() != null;
			}

			public String next() {
				String value = current.getItem();
				current = current.getNext();
				return value;
			}
		};
	}
	
}
