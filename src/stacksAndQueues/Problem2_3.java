package stacksAndQueues;

import java.util.Stack;

public class Problem2_3 {
	
	Stack<Integer> stack;
	Stack<Integer> minStack;
	
	public void push(int element) {
		if(stack.isEmpty()) {
			stack.push(element);
			minStack.push(element);
		} else {
			stack.push(element);
			int min = minStack.pop();
			if(min > element) {
				minStack.push(element);
			} else {
				minStack.push(min);
			}
		}
	}
	
	public int pop() {
		//if(!stack.isEmpty()) {
			int element = stack.pop();
			minStack.pop();
			return element;
		//} 
	}
	
	public int findMin() {
		//if(!stack.isEmpty()) {
			int element = minStack.pop();
			minStack.push(element);
			return element;
		//} 
	}
	
	public static void main(String args[]) {
		Problem2_3 myStack = new Problem2_3();
		myStack.push(100);
		myStack.push(250);
		System.out.println("Min::" + myStack.findMin());
	}

}
