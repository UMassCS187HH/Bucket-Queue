package queue;



public class PriorityQueue<T> {
	
	Bucket<T>[] BucketQueue;
	int size, DEFCAP=100, frontIndex, rearIndex;
	
	public PriorityQueue() {
		BucketQueue = (Bucket<T>[]) new Object[DEFCAP];
		this.size = 0;
		this.frontIndex = 0;
		this.rearIndex = 0;
	}
	
	public PriorityQueue(int size) {
		BucketQueue = (Bucket<T>[]) new Object[size];
		this.size = 0;
		this.frontIndex = 0;
		this.rearIndex = 0;
	}
	
	public boolean isEmpty() {
        // TODO 3
        return size == 0;
	}
	public int size() {
        // TODO 4
        return size;
	}
	public void enqueue(T[] elements) {
        // TODO 5
		Bucket<T> b = new Bucket<T>(elements);
		BucketQueue[rearIndex] = b;
		size++;
		rearIndex++;
	}
	public void dequeue() {
        // TODO 5
		BucketQueue[frontIndex] = null;
		size--;
		frontIndex++;
	}
	public String firstInLine() {
		return BucketQueue[frontIndex].getData().toString();
	}
	
	public void enqueueSorted(T[] elements){

	}
	
	public void sortQueue() {
		
	}
	
}
