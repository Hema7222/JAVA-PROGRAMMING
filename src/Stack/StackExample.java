package Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(33);
		stack.push(10);
		stack.push(21);
		stack.push(23);
		stack.push(25);
		
		
		System.out.println(stack);
		System.out.println(stack.peek());
		
		int last_removed_value = stack.pop();
		System.out.println("last_removed_value: "+last_removed_value);
		System.out.println("updated: "+stack);
		
		
		System.out.println("Last index: "+stack.lastIndexOf(23));
		
		System.out.println("is empty check: "+stack.isEmpty());
		System.out.println("capacity: "+stack.capacity());
		System.out.println("Clone: "+stack.clone());
		System.out.println("hashcode: "+stack.hashCode());
		
		System.out.println(stack.peek());
		
		System.out.println("Index value: "+stack.indexOf(23));
		System.out.println("search: "+stack.search(10));
		System.out.println("Is Contains: "+stack.contains(23));
		System.out.println("Stack is there or not: "+stack.addAll(stack));
		
		stack.clear();
		System.out.println(stack);
		System.out.println("Stack is there or not: "+stack.addAll(stack));
		

	}

}
