package oop.inheritance;

public class Clinked extends Slinked{
	public Clinked() {
		super();
	}
	
	@Override
	public void deleteFirst(int data)
	{
		//Node newHead = new Node(data);
		if(head==null)
		{
			return;
		}
		else if(head!=tail)
		{
			head=head.next;
			tail.next=head;
		}
		else
		{
			head = null;
			tail=null;
		}
	}
	
	@Override
	public void addFirst(int data)
	{
		Node newHead = new Node(data);
		if(head!=null)
		{
			newHead.next=head;
			tail.next=newHead;
		}
		else
		{
			newHead.next = newHead;
			tail = newHead;
		}
		head = newHead;
	}
	
	@Override
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		//checks if list is empty
		if(head==null)
		{
			newNode.next=newNode;
			head=newNode;
			tail=newNode;
			
		}
		else
		{
			newNode.next=head;
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
		System.out.println("Nodes of linked list");
		
		
		do 
		{                                                      //its like recursive
			System.out.println(current.data +"");                //if the current val is not null thn, loop will be 
			current=current.next;                                // continued
		}while(current!=head);
		
		System.out.println();
	}
	public class Node1 extends Node{
		public Node1(int data) {
			super(data);
		}

		public Node1(int data, Node next){
			super(data);
			
		}
	}
}





