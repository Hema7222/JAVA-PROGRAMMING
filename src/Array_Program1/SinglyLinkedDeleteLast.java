package Array_Program1;

public class SinglyLinkedDeleteLast {
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
	
	public void deleteLast(int data)
	{
		//Node newHead = new Node(data);
		if(head==tail)
		{
			return;
		}
		else if(head!=tail)
		{
			tail.next=null;
		}
		else
		{
			head=null;
			tail=null;
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
		SinglyLinkedDeleteLast s = new SinglyLinkedDeleteLast();
		s.addNode(1);
		s.addNode(2);
		s.addNode(3);
		s.addNode(4);
		s.addNode(5);
		s.deleteLast(0);
		
		s.display();
		

	}

}
