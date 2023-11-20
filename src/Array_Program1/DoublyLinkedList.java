package Array_Program1;

public class DoublyLinkedList {
	
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
		
		public void deleteFirst(int data)
		{
			//Node newHead = new Node(data);
			if(head == tail)
			{
				return;
			}
			else if(head!=tail)
			{
				head = head.next;
				head.previous = null;
			}
			else
			{
				head=null;
				tail=null;
			}
					
		}
		
		public void deleteLast(int data)
		{
			//Node newHead = new Node(data);
			if(head == tail)
			{
				return;
			}
			else if(head!=tail)
			{
				tail = tail.previous;
				tail.next = null;
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
			System.out.println("Nodes of doubly linked list - from 1st");
			
			while(current!=null) {                                    //its like recursive
				System.out.println(current.data +"");                //if the current val is not null thn, loop will be 
				current=current.next;                                // continued
			}
			
			System.out.println();
			
			/*Node last = tail;
			System.out.println("Nodes of doubly linked list - from last");
			while(last!=null)
			{
				
			}*/	
		}
	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		d.addNode(9);
		d.addNode(6);
		d.addNode(3);
		
		d.display();
		
	}
}

	
