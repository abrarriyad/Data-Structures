import java.util.Stack;

public class QueueWithTwoStacks {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void enqueue(int item) {
		stack1.push(item);
	}
	
	public int dequeue() {
		if(stack1.empty() && stack2.empty())
			throw new IllegalStateException();
		
	if(stack2.isEmpty()) {	
		while(!stack1.empty())
			stack2.push(stack1.pop());
	}
		return stack2.pop();
	}
	
}
