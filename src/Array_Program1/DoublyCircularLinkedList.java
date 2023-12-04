package Array_Program1;

public class DoublyCircularLinkedList {
	public DCNode node;
	public DCNode head;
	public DCNode tail;
	
	public DoublyCircularLinkedList(DCNode node) {
		this.node=node;
	}
	
	public void addNode() {
		addNode(0);
	}
	
	public void addNode(int data) {
		DCNode newNode = new DCNode(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			head.Previous = tail;	
			tail.next=head;
		}
		else
		{
			tail.next=newNode;
			newNode.Previous=tail;
			tail = newNode;
            tail.next = head;
            head.Previous = tail;
		}
	}
	
	public void display() {
        DCNode current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly circular linked list");

        do {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        } while (current != head);

        System.out.println();
    }

}
