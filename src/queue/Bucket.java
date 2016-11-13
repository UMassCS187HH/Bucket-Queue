package queue;

public class Bucket<T> implements Comparable<Bucket>{
	
	private T data;
	private int priority = -1;

	public Bucket() {
		this.data = null;
	}
	public Bucket(T data) {
		this.data = data;
	}
	public Bucket(T data, int priority) {
		this(data);
		this.setPriority(priority);
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public int compareTo(Bucket o) {
		// TODO Auto-generated method stub
		if (this.getPriority()>o.getPriority())
			return 1;
		else if (this.getPriority()<o.getPriority())
			return -1;
		else
			return 0;
	}
}
