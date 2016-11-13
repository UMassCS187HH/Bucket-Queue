# Bucket-Queue
## An Implementation of a Bucket Queue using an array

### Definition of a Bucket Queue

From Wikipedia:
> A bucket queue (also called a bucket priority queue or bounded-height priority queue) is a priority queue for prioritizing elements whose priorities are small integers. It has the form of an array of buckets: an array data structure, indexed by the priorities, whose cells contain buckets of items with the same priority as each other.

In other words a bucket queue is a priority queue composed of containers of other objects with the same priority.

### Project
#### Problem 1 - Design a Bucket

Your first task is to design a bucket such that it has a priorit, a way to store an object, and a way to compare its priority. For example, if I want one bucket to store the integers 1,2,3 with a priority of 1, I should be able to say 
```java
Bucket<PatientOrgan> b = new Bucket(new PatientOrgan(), 1);
```
#### Problem 2 - Design a Priority Queue

Next, you need to design a priority queue with the methods <b>enqueue</b>, <b>dequeue</b>, and <b>firstInLine</b>. These methods are similar to the ones we implemented in class.

#### Problem 3 - Sort the Queue

You should add methods to insert a bucket into its sorted position in the priority queue, and you should also have a method to sort the queue by priority after all the methods have been added. None of the Test cases will require the size of the queue to be greater than 100 elements.

The pigeon sort method should an int array with the priority of every element in the Priority Queue. It should be implemented using a Pigeonhole sort. 
>Pigeonhole sorting is a sorting algorithm that is suitable for sorting lists of elements where the number of elements (n) and the length of the range of possible key values (N) are approximately the same.[1] It requires O(n + N) time.


<b> Test cases will be provided for the bucket and priority queue implementation </b>

### Methods to Implement

```java
class Bucket {...}
class Priority Queue {
  	public boolean isEmpty() {
	public int size() {
	public void enqueue(Bucket b) 
	public void dequeue() 
	public String firstInLine() 
	public void sort(Bucket[])
	public void sortQueue()
	public void pigeonSort()
}
```

### Credits
Professor Mark Corner - 187 Honors Colloquium 2016

Author: Jagath Jai Kumar, November 2016 - jagathjk.me

