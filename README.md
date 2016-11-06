# Bucket-Queue
## An Implementation of a Bucket Queue using an array

### Definition of a Bucket Queue

From Wikipedia:
> A bucket queue (also called a bucket priority queue or bounded-height priority queue) is a priority queue for prioritizing elements whose priorities are small integers. It has the form of an array of buckets: an array data structure, indexed by the priorities, whose cells contain buckets of items with the same priority as each other.

In other words a bucket queue is a priority queue composed of containers of other objects with the same priority.

### Project
#### Problem 1 - Design a Bucket

Your first task is to design a bucket such that it has a priority and a way to store several objects in it. For example, if I want one bucket to store the integers 1,2,3 with a priority of 1, I should be able to say Bucket b = new Bucket(new int[1,2,3], 1);

#### Problem 2 - Design a Priority Queue

Next, you need to design a priority queue with the methods <b>enqueue</b>, <b>dequeue</b>, and <b>firstInLine</b>. These methods are similar to the ones we implemented in class.

#### Problem 3 - Sort the Queue

You should add methods to insert a bucket into its sorted position in the priority queue, and you should also have a method to sort the queue by priority after all the methods have been added. None of the Test cases will require the size of the queue to be greater than 100 elements.

#### Problem 4 - Implement a driver for patient data

In the support folder you will find a driver class and a class called patient record. Using the patient record class and the bucket queue, design a simulator for donor organs in a hospital. The driver has been started for you.


<b> Test cases will be provided for the bucket and priority queue implementation </b>

### Methods to Implement

'''java
Class Bucket {...}
Class Priority Queue {
  public boolean isEmpty() {
	public int size() {
	public void enqueue(T[] elements) 
	public void dequeue() 
	public String firstInLine() 
	public void enqueueSorted(T[] elements)
	public void sortQueue()
}


### Credits
Professor Mark Corner - 187 Honors Colloquium 2016
Author: Jagath Jai Kumar, November 2016 - jagathjk.me

