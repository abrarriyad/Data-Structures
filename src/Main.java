import java.awt.event.ItemEvent;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;





public class Main {

	public static void main(String[] args) {
	
		/*
		 * LinkedList list = new LinkedList(); list.addLast(10); list.addLast(30);
		 * list.addLast(40); list.addLast(50);
		 */
		//System.out.println(list.getKthFromTheEnd(2));
		//System.out.println(Arrays.toString(list.toArray()));
		//list.deleteKth(5);
		//list.removeDuplicate();
	//	list.recursiveRev();
		//System.out.println(Arrays.toString(list.toArray()));
		
		//System.out.println(list.isSorted());
		
		/*
		 * String string = "abcdefgh"; String reverseString=""; Stack<Character> stack =
		 * new Stack<Character>();
		 * 
		 * for(int i=0; i<string.length(); i++) { stack.push(string.charAt(i)); }
		 * 
		 * while (!stack.isEmpty()) { reverseString+=stack.pop(); //
		 * System.out.println(stack.pop()); }
		 * 
		 * //System.out.println(reverseString);
		 * 
		 * 
		 * String str = "(1+2)"; Expression expression = new Expression();
		 * System.out.println(expression.isBalanced(str));
		 */
		
		/*
		 * Stack stack = new Stack(); stack.push(10); stack.push(20); stack.push(30);
		 * stack.push(100); System.out.println(stack.peek());
		 * System.out.println(stack.peek()); while(!stack.isEmpty()) {
		 * System.out.println(stack.pop()); }
		 */
		
		/*
		 * Queue<Integer> queue = new ArrayDeque<Integer>(); queue.add(10);
		 * queue.add(20); queue.add(30); System.out.println(queue); Stack<Integer> stack
		 * = new Stack<Integer>();
		 * 
		 * while(!queue.isEmpty()) stack.push(queue.remove());
		 * 
		 * 
		 * System.out.println(stack.pop());
		 */
		
		/*
		 * ArrayQueue arrayQueue = new ArrayQueue(5); arrayQueue.enqueue(10);
		 * arrayQueue.enqueue(20); arrayQueue.enqueue(30); var front =
		 * arrayQueue.dequeue(); arrayQueue.enqueue(40); arrayQueue.enqueue(50);
		 * arrayQueue.enqueue(60);
		 * 
		 * 
		 * System.out.println(front); System.out.println(arrayQueue);
		 */
		
		/*
		 * QueueWithTwoStacks queue = new QueueWithTwoStacks(); queue.enqueue(10);
		 * queue.enqueue(20); queue.enqueue(30);
		 * 
		 * System.out.println(queue.dequeue());
		 */
		
		/*
		 * Map<Integer,String> map = new HashMap<Integer, String>();
		 * 
		 * map.put(1, "John"); map.put(2,"Riyad"); map.put(3,"Abrar");
		 * 
		 * for(var item : map.entrySet()) { System.out.println(item.getValue()); }
		 */
		
		/*
		 * CharFinder charFinder = new CharFinder(); var ch =
		 * charFinder.findFirstRepeatedChar("aaaa"); System.out.println(ch);
		 */
		
		/*
		 * HashTable hashTable = new HashTable(); hashTable.put(6, "A");
		 * hashTable.put(8, "B"); hashTable.put(11, "C");
		 * 
		 * System.out.println("Done");
		 */
		
		Tree tree = new Tree();
		tree.insert(7);
		tree.insert(4);
		tree.insert(9);
		tree.insert(9);
		tree.insert(6);
		tree.insert(8);
		tree.insert(10);
		//tree.traverseInOrder();
		System.out.println(tree.min());
	}

}
