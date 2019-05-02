package eg.edu.alexu.csd.datastructure.queue.cs_77_72_74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayBasedTest {

	@Test
	void test() {
		ArrayBased q=new ArrayBased(5);
		q.enqueue("12");
		q.enqueue("0");
		q.enqueue("m");
		q.enqueue("r");
		q.enqueue("a");
		assertEquals(5,q.size());
		assertEquals("12",q.dequeue());
		q.dequeue();
		assertEquals(3,q.size());
		q.enqueue("r");
		assertEquals(4,q.size());
		q.dequeue();
		q.dequeue();
		q.dequeue();
		//assertEquals(true,q.isEmpty());
	q.enqueue(1);
	q.enqueue(11);
	assertEquals("r",q.dequeue());
	assertEquals(false,q.isEmpty());
	}

}
