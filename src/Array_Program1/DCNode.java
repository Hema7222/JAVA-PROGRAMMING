package Array_Program1;

public class DCNode {
	int data;
	DCNode next;
	DCNode Previous;
	public DCNode(int data) {
		this.data=data;
	}
	
	public DCNode(int data, DCNode Previous, DCNode next) {
		this.data=data;
		this.Previous=Previous;
		this.next=next;
	}

	public int getData() {
		return data;
	}
	
	public DCNode getNext() {
		return next;
	}
	
	public DCNode getPrevious() {
		return Previous;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(DCNode next) {
		this.next = next;
	}
	
	public void setPrevious(DCNode previous) {
		Previous = previous;
	}

}
