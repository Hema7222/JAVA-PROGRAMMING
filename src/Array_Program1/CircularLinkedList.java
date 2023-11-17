package Array_Program1;

public class CircularLinkedList {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			//this.next=null;
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
		System.out.println("Nodes of circular linked list");
		
		
		do 
		{                                                      //its like recursive
			System.out.println(current.data +"");                //if the current val is not null thn, loop will be 
			current=current.next;                                // continued
		}while(current!=head);
		
		System.out.println();
	}


	public static void main(String[] args) {
		CircularLinkedList c = new CircularLinkedList();
		
		c.addNode(1);
		c.addNode(2);
		c.addNode(3);
		
		c.display();

	}

}
