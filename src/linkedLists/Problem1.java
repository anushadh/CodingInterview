package linkedLists;

public class Problem1 {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			this.data = d;
		}
	}
	
	void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data);
			n = n.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {

		Problem1 list = new Problem1();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(1);
		list.head.next.next.next.next = new Node(2);
		list.printList();
		list.removeDuplicates();
		list.printList();
	}

	private void removeDuplicates() {
		Node p1 = head;
		Node p2 = null;
		Node tmp = null;
		while(p1 != null && p1.next != null) {
			p2 = p1.next;
			while(p2.next != null) {
				if(p1.data == p2.data) {
					tmp = p2.next;
					p1.next = p2.next.next;
				} else {
					p2 = p2.next;
				}
			}
			p1 = p1.next;
		}
	}
	

}
