package arraysAndStrings;

import java.util.PriorityQueue;

//Kth largest number of an array
public class Problem10 {

	public static void main(String args[]) {
		
		int[] array = new int[] {5,6,4,3,2,1};
		findKthLargest(array, 4);
		
	}
	
/*	static void findKthLargest(int[] array, int k) {
		Arrays.sort(array);
		for(int i : array) {
			System.out.println(i);
		}
		System.out.println(array[array.length - k]);
		
	}*/
	
	static void findKthLargest(int[] array, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(k);
		
		for(int i : array) {
			pq.offer(i);
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		System.out.println(pq.peek());
	}
}
