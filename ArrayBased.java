package eg.edu.alexu.csd.datastructure.queue.cs_77_72_74;

public class ArrayBased{
	private	int n;
private	Object queue [];
ArrayBased(int m){
		this.n=m;
		queue=new Object[this.n];
	}
private int size=0;
	private int rear=-1;
	private int front=-1;
public void enqueue(Object item) {
if((rear==front&&rear!=-1)||(front==-1&&rear==queue.length)) {
	System.out.println("queue is full");return;
} 
	rear=(rear+1)%queue.length;
	size++;
	queue[rear]=item;
}
public boolean isEmpty() {
	return (rear==front&&rear==-1);
}
public Object dequeue() {
	Object o;
	if(isEmpty()) {
		System.out.println("queue is empty");
		return -1;
	}
	front=(front+1)%queue.length;
	o=queue[front];
	if(front==rear) {
		front=rear=-1;
	}
	size--;
	return o;
}
public int size() {
	return size;
}
void show(){
	for(int i=(front+1)%queue.length;i<queue.length;i++) {
		System.out.println(queue[i]);
	}
}
}