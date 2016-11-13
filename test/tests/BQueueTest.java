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
		p1.enqueue(b1);
		p1.dequeue();
		assertTrue(p1.isEmpty());
	}
}
