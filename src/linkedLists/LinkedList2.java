package linkedLists;

public class LinkedList2 {
	
	Node head;
	
	class Node {
		int data;
		Node pointer;
		
		Node(int d) {
			this.data = d;
		}
	}
	
	void push(int d) {
		Node node = new Node(d);
		node.pointer = head;
		head = node;		
	}
	
	void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data);
			n = n.pointer;
		}
		System.out.println();
	}
	
	void removeKey(int d) {
		Node n = head, prev = null;
		if(n != null && n.data == d) {
			head = n.pointer;
			return;
		}
		while(n != null && n.data != d) {
			prev = n;
			n = n.pointer;
		}
		if(n == null) return;
		prev.pointer = n.pointer;
	}

	public static void main(String[] args) {
		
		LinkedList2 list = new LinkedList2();		
		list.push(2);
		list.push(5);
		list.push(7);
		list.push(9);	
		list.printList();
		list.removeKey(7);
		list.printList();
	}

}
