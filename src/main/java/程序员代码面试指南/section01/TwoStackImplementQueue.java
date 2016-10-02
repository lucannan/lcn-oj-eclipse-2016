package 程序员代码面试指南.section01;


import java.util.*;

public class TwoStackImplementQueue {
	private Stack<Integer> stackPush;
	private Stack<Integer> stackPop;

	public TwoStackImplementQueue() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}

	public void add(int pushNum) {
		stackPush.add(pushNum);
	}

	public int peek() {
		if (this.stackPush.isEmpty() && this.stackPop.isEmpty()) {
			throw new RuntimeException("queue is empty");
		} else if (this.stackPop.isEmpty()) {
			while (!stackPush.isEmpty()) {
				this.stackPop.push(this.stackPush.pop());
			}
		}
		return stackPop.peek();
	}

	public int poll() {
		if (this.stackPush.isEmpty() && this.stackPop.isEmpty()) {
			throw new RuntimeException("queue is empty");
		} else if (this.stackPop.isEmpty()) {
			while (!stackPush.isEmpty()) {
				this.stackPop.push(this.stackPush.pop());
			}
		}
		return stackPop.pop();
	}

}
