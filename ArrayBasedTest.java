package eg.edu.alexu.csd.datastructure.queue.cs_77_72_74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayBasedTest {

	@Test
	void test() {
		ArrayBased test=new ArrayBased(5);
		test.enqueue(5);
		assertEquals(5,test.dequeue());
		assertEquals(true,test.isEmpty());
		assertEquals(0,test.size());
		test.enqueue(10);
		test.enqueue(15);
		test.enqueue(29);
		test.enqueue(12);
		assertEquals(10,test.dequeue());
		assertEquals(15,test.dequeue());
		assertEquals(false,test.isEmpty());
		assertEquals(2,test.size());
		}


}
