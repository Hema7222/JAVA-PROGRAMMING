package oops;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList s = new LinkedList(1);
		s.addNode(1);
		s.addNode(2);
		s.addNode(3);
		s.addNode(4);
		
		System.out.println("Nodes of singly linked list");
		s.display();

	}

}
