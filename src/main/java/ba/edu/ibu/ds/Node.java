package ba.edu.ibu.ds;

/**
 * Basic Node class
 * @author Dino Keco
 *
 */
public class Node {

	private String item;
	
	private Node next;

	public Node() {
		super();
	}
	public Node(String item) {
		super();
		this.item = item;
	}
	
	public Node(String item, Node next) {
		super();
		this.item = item;
		this.next = next;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
