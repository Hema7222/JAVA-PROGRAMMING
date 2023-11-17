package oops;

public class LinkedList extends Node {

	public LinkedList(int data) {
		super(data);
		
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display() {
		Node current=head;
		
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		while(current!=null) {                                    
			System.out.println(current.data +"");                 
			current=current.next;                               
		}
		
		System.out.println();
	}

}

