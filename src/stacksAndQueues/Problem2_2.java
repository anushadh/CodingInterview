package stacksAndQueues;

public class Problem2_2 {
	
	int[] array = new int[5];
	int[] minStack = new int[5];
	int count = -1;
	
	public void push(int element) {
		count++;
		if(count > 4) {
			System.out.println("Stack is full !");
		} else {
			array[count] = element;
			if(count > 0) {
				if(minStack[count-1] > element) {
					minStack[count] = element;
				} else {
					minStack[count] = minStack[count-1];
				}
			} else {
				minStack[count] = element;
			}
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
			//minStack[count] = Integer.MAX_VALUE;
			array[count] = -1;
		}
		printStack();
		return element;
	}
	
	public void printStack() {
		//System.out.println("--stack");
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("");
		//System.out.println("--Min");
		/*for(int i : minStack) {
			System.out.print(i + " ");
		}
		System.out.println("");*/
	}
	
	//O(n)
	public int findMin() {
		if(count >= 0) {
			return minStack[count];
		} else  {
			System.out.println("Stack is empty !");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		Problem2_2 stack = new Problem2_2();
		stack.push(0);
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
