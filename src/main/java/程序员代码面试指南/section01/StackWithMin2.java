package 程序员代码面试指南.section01;

import java.util.*;

public class StackWithMin2 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public StackWithMin2() {
		stackData = new Stack<Integer>();
		stackMin = new Stack<Integer>();
	}

	public void push(int newNum) {
		if (this.stackMin.isEmpty()) {
			this.stackMin.push(newNum);
		} else if (newNum < this.getMin()) {
			this.stackMin.push(newNum);
		} else {
			int newMin = this.stackMin.peek();
			this.stackMin.push(newMin);
		}

		this.stackData.push(newNum);
	}

	public int pop() {
		if (this.stackData.isEmpty()) {
			throw new RuntimeException("stack is Empty");
		}
		this.stackMin.pop();
		return this.stackData.pop();
	}

	public int getMin() {
		if (this.stackMin.isEmpty()) {
			throw new RuntimeException("the stack is Empty");
		}

		return this.stackMin.peek();
	}

}
