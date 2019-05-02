package eg.edu.alexu.csd.datastructure.queue.cs_77_72_74;

import java.util.NoSuchElementException;

public class LinkedBased {
Node front;
Node rear;
Node node;
private int size=0;
public boolean isEmpty() {
	return rear==null;
}
public int size() {
	return size;
}
public void enqueue(Object item) {
	Node n=new Node ();
	n.data=item;
	if(rear==null) {
		front=n;
	rear=n;

	}
	else {
		
		rear.next=n;
		rear=rear.next;
	}
	size++;
	//System.out.println(rear.data);
	}
public Object dequeue() {
	if(isEmpty()) {
 return -1;
	}
	
	
	else {	
		if(front.next==null) {
			Object o=front.data;
			size--;
			rear=null;
			return o;
			}
		Object o=front.data;
		front=front.next;
			size--;
		return o;}
	
	
}
public void show() {
	Node n = front;
	while (n.next != null) {
		System.out.println(n.data);
		n = n.next;
	}
	System.out.println(n.data);
}
}

