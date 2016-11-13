package queue;

import java.util.Arrays;
import java.util.Collections;

import driver.PatientOrgan;

public class PriorityQueue {
	
	Bucket<PatientOrgan>[] BucketQueue;
	int size, DEFCAP=100, frontIndex, rearIndex, nextPriority;
	
	public PriorityQueue() {
		BucketQueue = new Bucket[DEFCAP];
		this.size = 0;
		this.frontIndex = 0;
		this.rearIndex = 0;
		this.nextPriority = 0;
	}
	
	public boolean isEmpty() {
        // TODO 3
        return size == 0;
	}
	public int size() {
        // TODO 4
        return size;
	}
	public void enqueue(Bucket b) throws Exception {
        // TODO 5
		if (size >= DEFCAP)
			throw new Exception();
		BucketQueue[rearIndex] = b;
		size++;
		rearIndex=rearIndex+1%DEFCAP;
	}
	//dequeue by priority
	public PatientOrgan dequeue() throws Exception {
        // TODO 5
		Bucket<PatientOrgan>[] a = new Bucket[BucketQueue.length];
		for (int i = frontIndex; i < rearIndex; ++i){
			a[i] = BucketQueue[i];
		}
		sort(a);
		PatientOrgan p = a[nextPriority].getData();
		nextPriority++;
		return p;
	}
	public void sort(Bucket[] bq){
		Arrays.sort(bq);
	}
	
	public String firstInLine() {
		return BucketQueue[frontIndex].getData().toString();
	}
	
	
	//Return the order of priorities
	public int[] pigeonSort() {
		int[] a = new int[BucketQueue.length];
		for (int i = frontIndex; i < rearIndex; ++i){
			a[i] = BucketQueue[i].getPriority();
		}
		
		
		int min = a[0], max = a[0];
	    for (int x : a) {
	        min = Math.min(x, min);
	        max = Math.max(x, max);
	    }
	    final int size = max - min + 1;

	    // our array of pigeonholes
	    int[] holes = new int[size];  

	    // Populate the pigeonholes.
	    for (int x : a)
	        holes[x - min]++;

	    // Put the elements back into the array in order.
	    int i = 0;
	    for (int count = 0; count < size; count++)
	        while (holes[count]-- > 0)
	            a[i++] = count + min;
		return a;
	}
	
}
