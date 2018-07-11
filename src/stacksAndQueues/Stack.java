package stacksAndQueues;

public class Stack {
	
	int[] array = new int[5];
	int count = -1;
	
	public void push(int element) {
		count++;
		if(count > 4) {
			System.out.println("Stack is full !");
		} else {
			array[count] = element;
		}
		printStack();
	}
	
	public int pop() {
		count--;
		int element = -1;
		if(count < 0) {
			System.out.println("Stack is empty !");
		} else {
			element = array[count];
			array[count] = -1;
		}
		printStack();
		return element;
	}
	
	public void printStack() {
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
	}

}
