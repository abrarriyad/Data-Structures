import java.util.Arrays;

public class ArrayQueue {
	
	private int [] items;
	private int rear;
	private int count;
	private int front;
	
	public ArrayQueue(int capacity) {
		items = new int[capacity];
	}
	
	public void enqueue(int item) {
		if(count==items.length)
			throw new IllegalStateException();
		
		items[rear]=item;
		rear = (rear+1)%items.length;
		count++;
	}
	
	public int  dequeue() {
		var element = items[front];
		items[front]=0;
		front = (front+1)%items.length;
		count--;
		return element;
	}
	
	@Override
	public String toString() {
		//var item= Arrays.copyOfRange(items, front, rear);
		return Arrays.toString(items);
	}
	
	

}
