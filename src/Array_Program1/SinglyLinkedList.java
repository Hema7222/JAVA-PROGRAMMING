package Array_Program1;

public class SinglyLinkedList {
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
	
	public int length(Node currentRoot) {
		if(currentRoot==null) {
			return 0;
		}
		System.out.println(currentRoot.data+": Function call");
		int len = length(currentRoot.next);
		len=len+1;
		System.out.println(currentRoot.data+": "+len);
		return len;
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
		SinglyLinkedList s = new SinglyLinkedList();
		
		s.addNode(1);
		s.addNode(2);
		s.addNode(3);
		s.addNode(4);
		
		s.display();

	}

}
