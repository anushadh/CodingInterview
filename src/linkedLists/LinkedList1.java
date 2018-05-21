package linkedLists;
//Single Linked List
public class LinkedList1 {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}

	}

	void printList() {
		Node n = head;
		while(n != null) {
			System.out.println( n.data +" " + n.next);
			n = n.next;
		}
	}
	
	void addNode(int d, Node pointer) {
		if(pointer == null) {
			System.out.println("Pointer cannot be null");
		}
		Node nodeMid = new Node(5);
		nodeMid.next = pointer.next;
		pointer.next = nodeMid;
	}
	
	void addAtEnd(int d) {
		Node end = new Node(d);
		if(head == null) {
			head = end;
			return;
		}
		end.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;		
		}
		last.next = end;
		return;
	}

	public static void main(String args[]) {

		LinkedList1 list = new LinkedList1();

		list.head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);

		list.head.next = node2;
		node2.next = node3;
		System.out.println("LinkedList::");
		list.printList();

		//Add a node at the head
		Node node0 = new Node(0);
		node0.next = list.head;
		list.head = node0;
		System.out.println("LinkedList::Insert at head::");
		list.printList();
		
		//Add a node after a pointer
		list.addNode(5, node2);
		System.out.println("LinkedList::Insert at Pointer::");
		list.printList();
		
		//Add a node at the end
		list.addAtEnd(6);
		System.out.println("LinkedList::Insert at end::");
		list.printList();
		
	}

}
