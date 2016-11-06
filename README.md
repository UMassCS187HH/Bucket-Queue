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

You should add methods to 
