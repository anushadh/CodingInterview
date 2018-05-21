package linkedLists;

public class LinkedList3 {
	
	Node head;
	static class Node{
		int data;
		Node next;
	}
	
	public static void main(String args[]) {
		
		LinkedList3 list = new LinkedList3();
		list.insertNode(2, 0);
		list.printList();
		list.insertNode(9, 0);
		list.printList();
		list.insertNode(3, 1);
		list.printList();
	}
	
	void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + "--");
			n = n.next;
		}
		System.out.println("-----------------");
	}

	private void insertNode(int data, int position) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		} else {
			if(position == 0) {
				node.next = head;
				head = node;
			} else {
				int count = 0;
				Node n = head;
				Node tmp = null;
				while(n != null) {
					if(count == position-1) {
						tmp = n.next;
						n.next = node;
						node.next = tmp;
					}
					count++;
					n = n.next;
				}
			}
		}
	}

}
