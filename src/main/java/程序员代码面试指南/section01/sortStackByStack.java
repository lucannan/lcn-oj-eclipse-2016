package 程序员代码面试指南.section01;

import java.util.*;

public class sortStackByStack {

	public static void sortStackByStack(Stack<Integer> stack) {
		Stack<Integer> help = new Stack<Integer>();
		while (!stack.isEmpty()) {
			int cur = stack.pop();
			while ((!help.isEmpty()) && help.peek() < cur) {
				stack.push(help.pop());
			}
			help.push(cur);
		}

		while (!help.isEmpty()) {
			stack.push(help.pop());
		}
	}
}
