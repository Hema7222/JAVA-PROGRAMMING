package Array_Program1;

public class SinglyLinkedInsertFirst {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	//head and tail
	public Node head = null;
	public Node tail = null;
	
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

	public static void main(String[] args) {
		SinglyLinkedInsertFirst s = new SinglyLinkedInsertFirst();
		
		s.addNode(1);
		s.addNode(2);
		s.addNode(3);
		s.addNode(4);
		s.addFirst(5);
		
		s.display();
		

	}

}
