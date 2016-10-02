package 程序员代码面试指南.section01;

import java.util.*;

public class InverseStack {
	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.isEmpty()) {
			return result;
		} else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}

	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}

		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < 4; i++) {
			stack.push(i);
		}

		System.out.println();

//		System.out.println(getAndRemoveLastElement(stack));
		reverse(stack);
		System.out.println();
	}

}
