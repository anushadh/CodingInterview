package stacksAndQueues;

public class Problem2 {
	
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
	
	public int findMin() {
		int min = -1;
		int temp = Integer.MAX_VALUE;
		for(int i = 0; i < count; i++) {
			if(array[i] < temp) {
				temp = array[i];
			}
		}
		min = temp;
		return min;
	}
	
public static void main(String[] args) {
		
		Problem2 stack = new Problem2();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Min:: " + stack.findMin());
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Min:: " + stack.findMin());
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Min:: " + stack.findMin());
		stack.push(40);
		stack.push(50);
		stack.push(60);
	}
	
}
