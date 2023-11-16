package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(100);
		queue.offer(20);              //offer -> enque -> add
		queue.offer(34);
		queue.offer(88);
		queue.offer(92);
		queue.offer(77);
		
		System.out.println(queue);
		
		queue.poll();                  //first element will be removed
		System.out.println(queue);
		
		System.out.println("Peek: "+queue.peek());
		System.out.println("Is Empty: "+queue.isEmpty());
		System.out.println("Is Contains: "+queue.contains(77));    //contains -> true/false
		
		System.out.println("Iterator: "+queue.iterator());
		
		System.out.println("remove: "+queue.remove(92));
		System.out.println(queue);
		System.out.println("size: "+queue.size());
		
		System.out.println("Hashcode: "+queue.hashCode());

	}

}
