package ba.edu.ibu.ds;

import java.util.Iterator;

public class LinkedListIterator implements Iterator<String>{

	private Node current ;

	public LinkedListIterator(Node first) {
		this.current = first;
	}
	public boolean hasNext() {
		return current.getNext() != null;
	}

	public String next() {
		String value = current.getItem();
		current = current.getNext();
		return value;
	}

}
