package stacksAndQueues;

import java.util.Stack;

public class Problem2_3 {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	public void push(int element) {
		if(stack.isEmpty() == true) {
			stack.push(element);
			minStack.push(element);
		} else {
			stack.push(element);
			int min = minStack.pop();
			minStack.push(min);
			if(min > element) {
				minStack.push(element);
			} else {
				minStack.push(min);
			}
		}
		
	}
	
	public int pop() {
		if(!stack.isEmpty()) {
			int element = stack.pop();
			int min = minStack.pop();
			
			return element;
		} else {
			System.out.println("Stack is empty!");
			return 0; 
		}
		
	}
	
	public void findMin() {
		if(!stack.isEmpty()) {
			int element = minStack.pop();
			minStack.push(element);
			System.out.println("Min element:: " + element);
		} else {
			System.out.println("Stack is empty!");
		}
	}
	
	public boolean isEmpty() {
		if(stack.size() > 0) {
			return true;
		} 
		return false;
	}
	
	public void printStack() {
		System.out.println("Stack:");
		for(int i : stack) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("Min Stack:");
		for(int i : minStack) {
			System.out.print(i + " ");
		}
		System.out.println("**********");
	}
	
	public static void main(String args[]) {
		Problem2_3 myStack = new Problem2_3();
		//myStack.printStack();
		myStack.push(100);
		myStack.findMin();
		myStack.push(50);
		myStack.push(2000);
		myStack.findMin();
		myStack.pop();
		myStack.findMin();
		myStack.pop();
		myStack.findMin();
	}

}
