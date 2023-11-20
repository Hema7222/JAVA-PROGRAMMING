package oop.inheritance;
//parent

public class Slinked {
	 protected Node head;
	    protected Node tail;
	    public Slinked() {
	        super();
	    }

	//public Node head = null;
	//public Node tail = null;
	
	    public void addFirst(int data)
		{
			Node newHead = new Node(data);
			if(head == null)
			{
				newHead.next=head;
			}
			else
			{
				Node temp = head;
				head = newHead;
				head.next = temp;
			}
			head = newHead;
		}
	   
	    public void deleteFirst(int data)
		{
			//Node newHead = new Node(data);
			if(head==tail)
			{
				return;
			}
			else if(head!=tail)
			{
				head=head.next;
			}
			else
			{
				head=null;
				tail=null;
			}
		}
	    
	    //create addnode
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		//checks if list is empty
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
		System.out.println("Nodes of singly linked list");
		
		
		while(current!=null) {                                    //its like recursive
			System.out.println(current.data +"");                //if the current val is not null thn, loop will be 
			current=current.next;                                // continued
		}
		
		System.out.println();
	}
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	

}
