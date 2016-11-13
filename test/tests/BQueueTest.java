package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import driver.PatientOrgan;
import queue.Bucket;
import queue.PriorityQueue;

public class BQueueTest {

	PatientOrgan o1 = new PatientOrgan("John","Heart","Good");
	PatientOrgan o2 = new PatientOrgan("Jonny","Heart","Bad");
	PatientOrgan o3 = new PatientOrgan("Jon","Lung","Good");
	PatientOrgan o4 = new PatientOrgan("Jan","Kidney","Bad");
	PatientOrgan o5 = new PatientOrgan("Jane","Liver","Bad");
	PatientOrgan o6 = new PatientOrgan("Joe","Heart","Bad");
	PatientOrgan o7 = new PatientOrgan("Joseph","Liver","Good");
	PatientOrgan o8 = new PatientOrgan("Jill","Brain","Good");
	
	
	
	PriorityQueue p1 = new 
			PriorityQueue();
	
	@Test
	public void testEnqueue() throws Exception {
		Bucket<PatientOrgan> b1 = new Bucket<PatientOrgan>();
		b1.setData(o1);
		b1.setPriority(1);
		p1.enqueue(b1);
		assertEquals("enqueue doesn't return correct size", 1,
				p1.size());
	}
	
	@Test
	public void testDequeue() throws Exception {
		Bucket<PatientOrgan> b1 = new Bucket<PatientOrgan>();
		b1.setData(o1);
		b1.setPriority(1);
		Bucket<PatientOrgan> b2 = new Bucket<PatientOrgan>();
		b2.setData(o2);
		b2.setPriority(2);
		Bucket<PatientOrgan> b3 = new Bucket<PatientOrgan>();
		b3.setData(o3);
		b3.setPriority(3);
		p1.enqueue(b1);
		p1.enqueue(b2);
		p1.enqueue(b3);
		assertEquals("John",(p1.dequeue().getName()));
		assertEquals("Jonny",(p1.dequeue().getName()));
		assertEquals("Jon",(p1.dequeue().getName()));
		
	}
	
	@Test 
	public void firstInLine(){
		Bucket<PatientOrgan> b2 = new Bucket<PatientOrgan>();
		b2.setData(o2);
		b2.setPriority(2);
		Bucket<PatientOrgan> b3 = new Bucket<PatientOrgan>();
		b3.setData(o3);
		b3.setPriority(3);
		Bucket<PatientOrgan> b1 = new Bucket<PatientOrgan>();
		b1.setData(o1);
		b1.setPriority(1);

		p1.enqueue(b2);
		p1.enqueue(b3);
		p1.enqueue(b1);
		assertEquals("Jonny", p1.firstInLine());
		
	}
	
	@Test 
	public void pigeonHoleTest(){
		Bucket<PatientOrgan> b1 = new Bucket<PatientOrgan>();
		b1.setData(o1);
		b1.setPriority(1);
		Bucket<PatientOrgan> b2 = new Bucket<PatientOrgan>();
		b2.setData(o2);
		b2.setPriority(2);
		Bucket<PatientOrgan> b3 = new Bucket<PatientOrgan>();
		b3.setData(o3);
		b3.setPriority(3);
		Bucket<PatientOrgan> b4 = new Bucket<PatientOrgan>();
		b4.setData(o4);
		b4.setPriority(1);
		Bucket<PatientOrgan> b5 = new Bucket<PatientOrgan>();
		b5.setData(o5);
		b5.setPriority(4);
		Bucket<PatientOrgan> b6 = new Bucket<PatientOrgan>();
		b6.setData(o6);
		b6.setPriority(3);
		Bucket<PatientOrgan> b7 = new Bucket<PatientOrgan>();
		b7.setData(o7);
		b7.setPriority(5);
		Bucket<PatientOrgan> b8 = new Bucket<PatientOrgan>();
		b8.setData(o8);
		b8.setPriority(6);

		p1.enqueue(b2);
		p1.enqueue(b3);
		p1.enqueue(b1);
		p1.enqueue(b4);
		p1.enqueue(b5);
		p1.enqueue(b6);
		p1.enqueue(b7);
		p1.enqueue(b8);
		
		int[] b = {1,1,2,3,3,4,5,6};
		int[] c = p1.pigeonSort();
		for (int i = 0; i < b.length; i++){
			assertEquals(b[i],c[i]);
		}
	}
	@Test 
	public void sortTest(){
		Bucket<PatientOrgan> b1 = new Bucket<PatientOrgan>();
		b1.setData(o1);
		b1.setPriority(1);
		Bucket<PatientOrgan> b2 = new Bucket<PatientOrgan>();
		b2.setData(o2);
		b2.setPriority(2);
		Bucket<PatientOrgan> b3 = new Bucket<PatientOrgan>();
		b3.setData(o3);
		b3.setPriority(3);
		Bucket<PatientOrgan> b4 = new Bucket<PatientOrgan>();
		b4.setData(o4);
		b4.setPriority(1);
		Bucket<PatientOrgan> b5 = new Bucket<PatientOrgan>();
		b5.setData(o5);
		b5.setPriority(4);
		Bucket<PatientOrgan> b6 = new Bucket<PatientOrgan>();
		b6.setData(o6);
		b6.setPriority(3);
		Bucket<PatientOrgan> b7 = new Bucket<PatientOrgan>();
		b7.setData(o7);
		b7.setPriority(5);
		Bucket<PatientOrgan> b8 = new Bucket<PatientOrgan>();
		b8.setData(o8);
		b8.setPriority(6);

		p1.enqueue(b2);
		p1.enqueue(b3);
		p1.enqueue(b1);
		p1.enqueue(b4);
		p1.enqueue(b5);
		p1.enqueue(b6);
		p1.enqueue(b7);
		p1.enqueue(b8);
		
		p1.sort();
		String[] sortedNames = {"John","Jan","Jonny","Jon","Joe","Jane","Joseph","Jill"};
		for (int i = 0; i < p1.size(); i++){
			assertEquals(sortedNames[i],p1.get(i).getName());
		}
	}
}
