package datastructures;

public class Queue {
	int[] array = new int[5];
	int count = -1;
	
	public void enqueue(int element) {
		if(count > 4) {
			System.out.println("Queue is full");
		} else {
			count++;
			array[count] = element;			
		}
	}
	
	public int dequeue() throws Exception {
		if(count < 0) {
			System.out.println("Queue is empty");
			throw new Exception("Queue is empty");
		} else {
			int element = array[0];
			for(int i = 0; i < count; i++) {
				array[i] = array[i+1];
			}	
			return element;
		}		
	}
	
	public void printQueue() {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String args[]) {
		Queue q1 = new Queue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.printQueue();
		q1.enqueue(50);
	}
}
