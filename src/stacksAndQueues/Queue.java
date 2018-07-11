package stacksAndQueues;

public class Queue {

	int[] array = new int[5];
	int count = 0;
	
	public void enqueue(int element) {
		if(count > 4) {
			System.out.println("Queue is full !");
			return;
		} else {
			array[count] = element;
			count++;
		}
		printQueue();
	}
	
	public int dequeue() {
		count--;
		int element = -1;
		if(count < 0) {
			System.out.println("Queue is empty");
		} else {
			element = array[0];
			for(int i = 0; i < count; i++) {
				array[i] = array[i+1];
			}
			array[count] = -1;
		}
		printQueue();
		return element;
	}
	
	public void printQueue() {
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}

}
