package 程序员代码面试指南.section01;

public class P36 {
	public static Node1 removeLastKthNode(Node1 head, int k) {
		if (head == null || k < 1) {
			return head;
		}

		Node1 cur = head;
		while (cur != null) {
			k--;
			cur = cur.next;
		}
		if (k == 0) {
			head = head.next;
		}

		if (k < 0) {
			cur = head;
			while (++k != 0) {
				cur = cur.next;
			}

			cur.next = cur.next.next;
		}

		return head;
	}

	public static DoubleNode removeLastKthNode(DoubleNode head, int k) {
		if (head == null || k < 1) {
			return head;
		}

		DoubleNode cur = head;

		while (cur != null) {
			k--;
			cur = cur.next;
		}

		if (k == 0) {
			head = head.next;
			head.last = null;
		}

		if (k < 0) {
			cur = head;
			while (++k != 0) {
				cur = cur.next;
			}

			DoubleNode newNext = cur.next.next;
			cur.next = newNext;

			if (newNext != null) {
				newNext.last = cur;

			}
		}

		return head;

	}
}

class Node1 {
	public int value;
	public Node1 next;

	public Node1(int data) {
		this.value = data;
	}
}

class DoubleNode {
	public int value;
	public DoubleNode last;
	public DoubleNode next;

	public DoubleNode(int data) {
		this.value = data;
	}
}