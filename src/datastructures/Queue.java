package datastructures;

public class Queue {
	int[] array = new int[5];
	int count = -1;
	
	public void enqueue(int element) {
		count++;
		if(count > 4) {
			System.out.println("Queue is full");
		} else {
			array[count] = element;			
		}
		printQueue();
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
			array[count] = -1;
			count--;
			printQueue();
			return element;
		}		
	}
	
	public void printQueue() {
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) throws Exception {
		Queue q1 = new Queue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.dequeue();
		q1.enqueue(60);
		q1.enqueue(70);
		
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
	}
}
