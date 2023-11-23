package Queue;

public class QueueLinkedList<E> {
	QueueNode<E> first;
	QueueNode<E> last;
	int size = 0;
	
	public void offer(E value)
	{
		if(first == null)
		{
			QueueNode<E> currentFirst = new QueueNode<E>();
			first = currentFirst;
			first.setData(value);
			first.setNext(null);
			last=first;
			size=size+1;
		}
		else
		{
			QueueNode<E> currentLast = new QueueNode<E>();
			currentLast.setData(value);
			currentLast.setNext(null);
			last.setNext(currentLast);
			last=currentLast;
			size=size+1;
		}
	}
	
	public void poll() {
		if(first!=null) {
			first = first.getNext();
			size--;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public E peek() {
		if(last!=null)
			return last.getData();
		else
			return null;
	}
	
	public void display() {
		if(first!=null)
		{
			QueueNode<E> next = first;
			while(next!=null) {
				System.out.println(next.getData());
				next=next.getNext();
			}
			
		}
		else
			System.out.println("List is empty");
			
	}
	
}