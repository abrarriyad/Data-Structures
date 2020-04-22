
public class Stack {
	int size;
	int [] arr = new int[size];
	static int count;
	
	public Stack() {
		size=10;
	}
	
	
	public void push(int item) {
		arr[count++]=item;
	}
	
	public int pop() {
		return arr[count--];
	}
	
	public int peek() {
		return arr[count];
	}
	
	public boolean isEmpty() {
		return count>0;
	}

}
