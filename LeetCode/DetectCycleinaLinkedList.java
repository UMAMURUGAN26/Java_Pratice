import java.util.HashSet;

//Floyd’s Cycle Detection Algorithm

class Node {
	int data;
	Node next;

	public Node(int x) {
		this.data = x;
		this.next = null;
	}
}

public class DetectCycleinaLinkedList {

	public static void main(String[] args) {

		// Create a hard-coded linked list:
		// 1 -> 3 -> 4

		Node head = new Node(1);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);

		if (detectloop(head)) {
			System.out.println("Cycle detected");
		} else {
			System.out.println("No Cycle detected");
		}

	}

	private static boolean detectloop(Node head) {

		HashSet<Node> hm = new HashSet<Node>();
		while (head != null) {
			if (hm.contains(head)) {
				return true;
			}

			hm.add(head);
			head = head.next;
		}

		Node slow = head;
		Node fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {

				return true;
			}

		}

		return false;

	}
}