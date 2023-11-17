package Array_Program1;

public class DoublyLinkedInsertFirst {
		
		class Node{
			int data;
			Node next;
			Node previous;
			
			public Node(int data) {
				this.data=data;
				}
		}
		
		//head and tail
		public Node head = null;
		public Node tail = null;
		
		public void addFirst(int data)
		{
			Node newHead = new Node(data);
			if(head == null)
				newHead.next = null;
			else
			{
				head.previous = newHead;
				newHead.next = head;
			}
			head = newHead;
			head.previous = null;
		}
		
		//create addnode
		public void addNode(int data) {
			Node newNode = new Node(data);
			
			//checks if list is empty
			if(head==null)
			{
				head=newNode;
				tail=newNode;
				head.previous = null;	
				tail.next=null;
			}
			else
			{
				tail.next=newNode;
				newNode.previous=tail;
				tail=newNode;
				tail.next=null;
			}
		}
		public void display() {
			Node current=head;
			
			if(head==null)
			{
				System.out.println("List is empty");
				return;
			}
			System.out.println("Nodes of doubly linked list");
			
			while(current!=null) {                                    //its like recursive
				System.out.println(current.data +"");                //if the current val is not null thn, loop will be 
				current=current.next;                                // continued
			}
			
			System.out.println();
		}

	public static void main(String[] args) {
		DoublyLinkedInsertFirst d = new DoublyLinkedInsertFirst();
		d.addNode(1);
		d.addNode(2);
		d.addNode(3);
		d.addFirst(45);
		
		d.display();

	}

}
