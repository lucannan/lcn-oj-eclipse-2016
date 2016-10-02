package 程序员代码面试指南.section01;


import java.util.Stack;

public class StackWithMin {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public StackWithMin() {
		this.stackData = new Stack<>();
		this.stackMin = new Stack<Integer>();
	}

	public void push(int newNum) {
		if (this.stackMin.isEmpty()) {
			this.stackMin.push(newNum);
		} else if(newNum <= this.getMin()){
			this.stackMin.push(newNum);
		}
		
		this.stackData.push(newNum);
	}

	public int getMin() {
		if (this.stackMin.isEmpty()) {
			throw new RuntimeException("stack is empty");
		} 
		
		return this.stackMin.peek();
	}
	
	
	public int pop(){
		if(this.stackData.isEmpty()){
			throw new RuntimeException("stack is empty");
		}
		
		int value = this.stackData.pop();
		if(value == this.getMin()){
			this.stackMin.pop();
		}
		return value;
	}

}
