package Queue;

public class QueueNode<E> {
	E data;
	QueueNode<E> next;
	
	public E getData() {
		return data;
	}
	
	public QueueNode<E> getNext() {
		return next;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	
	public void setNext(QueueNode<E> next) {
		this.next = next;
	}
	
}
