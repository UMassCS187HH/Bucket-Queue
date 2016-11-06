package queue;

public class Bucket<T> {
	
	private T[] data;
	private int priority = -1;

	public Bucket() {
		this.data = null;
	}
	public Bucket(T[] data) {
		this.data = data;
	}
	public Bucket(T[] data, int priority) {
		this(data);
		this.setPriority(priority);
	}
	
	public T[] getData() {
		return data;
	}
	public void setData(T[] data) {
		this.data = data;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
}
