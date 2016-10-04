package 程序员代码面试指南.section01;

import java.util.*;

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

	// 删除链表中间处的结点
	public static Node1 removeMidNode(Node1 head) {
		if (head == null || head.next == null) {
			return head;
		}

		if (head.next.next == null) {
			return head.next;
		}

		Node1 pre = head;
		Node1 cur = head.next.next;

		while (cur.next != null && cur.next.next != null) {
			pre = pre.next;
			cur = cur.next;
		}

		pre.next = pre.next.next;
		return head;
	}

	// 删除链表中a/b处的结点
	public static Node1 removeByRatio(Node1 head, int a, int b) {
		if (a < 1 || a > b) {
			return head;
		}
		int n = 0;
		Node1 cur = head;
		while (cur != null) {
			n++;
			cur = cur.next;
		}

		n = (int) Math.ceil((double) (a * n) / (double) (b));
		if (n == 1) {
			head = head.next;
		}

		if (n > 1) {
			cur = head;
			while (--n != 1) {
				cur = cur.next;
			}
			cur.next = cur.next;
		}

		return head;
	}

	// 反转单向链表
	public static Node1 reverseList(Node1 head) {
		Node1 pre = null;
		Node1 next = null;

		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}

		return pre;
	}

	// 反转双向链表
	public static DoubleNode reverseList2(DoubleNode head) {
		DoubleNode pre = null;
		DoubleNode next = null;

		while (head != null) {
			next = head.next;
			head.next = pre;
			head.last = next;
			pre = head;
			head = next;
		}
		return next;
	}
	
	//反转部分单向链表
	public static Node1 reversePart(Node1 head,int from, int to){
		int len = 0;
		Node1 node1 = head;
		Node1 fpre = null;
		Node1 tpos = null;
		
		while(node1!=null){
			len++;
			fpre = len == from - 1?node1:fpre;
			tpos = len == to + 1 ? node1:tpos;
		}
		
		if(from > to || from < 1 || to > len){
			return head;
		}
		
		node1 = fpre == null ? head : fpre.next;
		
		Node1 node2 = node1.next;
		node1.next = tpos;
		Node1 next = null;
		
		while(node2 != tpos){
			next = node2.next;
			node2.next = node1;
			node1 = node2;
			node2 = next;
		}
		
		if(fpre != null){
			fpre.next = node1;
			return head;
		}
		
		return node1;
		
	}
	
	
	//判断一个链表是否是回文结构
	public static boolean isPalindrome1(Node1 head){
		Stack<Node1> stack = new Stack<Node1>();
		Node1 cur = head;
		while(cur!=null){
			stack.push(cur);
			cur = cur.next;
		}
		
		while(head!=null){
			if(head.value != stack.pop().value){
				return false;
			}
			head = head.next;
		}
		
		return true;
	}
	
	//合并两个有序的单链表
	
	
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