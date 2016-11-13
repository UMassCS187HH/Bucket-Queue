package queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import driver.PatientOrgan;

public class PriorityQueue {
	
	
	List<Bucket<PatientOrgan>> BucketQueue;
	int size;
	
	public PriorityQueue() {
		BucketQueue = new LinkedList<Bucket<PatientOrgan>>();
		this.size = 0;
	}
	
	public PatientOrgan get(int i){
		return BucketQueue.get(i).getData();
	}
	
	public boolean isEmpty() {
        // TODO 3
        return size == 0;
	}
	public int size() {
        // TODO 4
        return size;
	}
	public void enqueue(Bucket<PatientOrgan> b) {
        // TODO 5
		BucketQueue.add(b);
		size++;
	}
	//dequeue by priority
	public PatientOrgan dequeue() {
        // TODO 5
		sort();
		
		return BucketQueue.remove(0).getData();
	}
	public void sort(){
		 Collections.sort(BucketQueue, new Comparator<Bucket<PatientOrgan>>() {
	         @Override
	         public int compare(Bucket<PatientOrgan> o1, Bucket<PatientOrgan> o2) {
	             if (o1.getPriority()>o2.getPriority())
	            	 return 1;
	             else if (o1.getPriority()<o2.getPriority())
	            	 return -1;
	             else
	            	 return 0;
	         }
	     });
	}
	
	public String firstInLine() {
		return BucketQueue.get(0).getData().getName();
	}
	
	
	//Return the order of priorities
	public int[] pigeonSort() {
		int[] a = new int[BucketQueue.size()];
		for (int i = 0; i < BucketQueue.size(); i++){
			a[i] = BucketQueue.get(i).getPriority();
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
