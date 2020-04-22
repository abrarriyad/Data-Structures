import java.util.NoSuchElementException;
import java.util.Stack;


public class LinkedList {
	
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node first;
	private Node last;
	private int size;
	

	
	public void addLast(int item) {
		var node = new Node(item);
		
		if(isEmpty()) 
			first = last= node;
		else {
			last.next = node;
			last = node;
		}
		size++;
	}
	
	public void addFirst(int item) {
		var node = new Node(item);
		
		if(isEmpty())
				first = last = node;
		else {
			node.next = first;
			first = node;
			
		}
		size++;
	}
	
	public int indexOf(int item) {
		int index=0;
		var current = first;
		while(current !=null) {
			if(current.value == item) return index;
			current = current.next;
			index++;
		}
		return -1;
	}
	
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}
	
	public void removeFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		if(first==last)
			first = last = null;
		else {
			var second = first.next;
			first.next = null;
			first = second;
		}
		size--;
	}
	
	public void removeLast() {
		if(isEmpty())
			throw new NoSuchElementException();
		if(first == last) 
			first = last = null;
		else {	
			var previous =  getPrevious(last);
			last = previous;
			last.next = null;
		}
		size--;
	}
	
	private Node getPrevious(Node node) {
		var current = first;
		while(current != null) {
			if(current.next==node) return current;
			current= current.next;
		}
		return null;
	}
	
	public int size() {
		return size;
	}
	
	public int[] toArray() {
		int[] array = new int[size];
		var current = first;
		var index = 0;
		while(current !=null) {
			array[index++] = current.value;
			current = current.next;
		}
		return array;
	}
	
	public void reverse() {
		
		if(isEmpty()) return;
		
		var previous = first;
		var current = first.next;
		
		while(current!=null) {
			var next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		last = first;
		last.next = null;
		first = previous;
	}
	
	public int getKthFromTheEnd(int k) {
		var a = first;
		var b = first;
		
		for(int i=0; i<k-1; i++) {
			b = b.next;
			if(b==null)
				throw new IllegalArgumentException();
		}
		while(b!=last) {
			a = a.next;
			b = b.next;
		}
		return a.value;
	}
	
	public void deleteFirst() {
		
		if(first==last)
			first = last = null;
		
		var current = first.next;
		first.next = null;
		first = current;
		
		size--;
		
	}
	
	public void deleteKth(int k) {
		Node previous = null;
		Node current = first;
		
		for(int i=0; i<k-1; i++) {
			previous = current;
			current = current.next;
		}
		if(current.next ==last) {
			previous.next = null;
			last = previous;
		}
		else {
		previous.next = current.next;
		current.next= null;
		}		
		
		size--;
		
	}
	
	public boolean isSorted() {
		Node current = first;
		Node next = first.next;
		while(next!=null){
			
			if(current.value>next.value)
				return false;
			
			current = current.next;
			next = current.next;
		}
		return true;
	}
	
	public void removeDuplicate() {
		Node current = first;
		Node next = first.next;
		
		while(next!=null) {
			if(current.value==next.value) {
				current.next = next.next;
				next = null;
				next = current.next;
				size--;
			}
			else {
				current = current.next;
				next = current.next;
			}
		}
	}
	
	public void reverse2() {
		Node p = first;
		Node q = null;
		Node r = null;
		
		while(p!=null) {
			r = q;
			q = p;
			p = p.next;
			q.next = r;
		}
		first = q;
	}
	
	public void recursiveRev() {
		Node p = first;
		Node q = null;
		reverse3(q,p);
	}
	
	public void reverse3(Node q, Node p) {
		if(p!=null) {
			reverse3(p, p.next);
			p.next = q;
		}
		else {
			first = q;
		}
	}
	
	public boolean isLoop() {
		Node p = first;
		Node q = first;
		
		do {
			p = p.next;
			q = q.next;
			q = (q!=null)?q.next:null;
		}while(p!= null && q!=null && p!=q);
		
		if(p==q)
			return true;
		else 
			return false;
	}
	
	public Node findMiddleNode(Node head) {
		Node p = head;
		Node q = p;
		
		while(q!=null) {
			q = q.next;
			q = q.next!=null?q.next:null;
			if(q!=null)
				p=p.next;
		}
		return p;
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	
	
}
