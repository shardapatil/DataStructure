//Code by: Sharda Patil
package com.circularqueue.ops;

public class CircularQueueQ2 {
	
	private int[] arr;
	private int capacity;
	private int front,rear;
	
	public CircularQueueQ2(int size)
	{
		capacity = size;
		arr = new int[size];
		front = rear = -1;
	}
	
	public boolean isQueueFull()
	{
		if((rear + 1) % capacity == front)
			return true;
		else
			return false;
	}
	
	public boolean isQueueEmpty()
	{
		if((rear == -1 && front == -1))
			return true;
		else
			return false;
	}
	
	public void enqueue(int element)
	{
		if(isQueueFull())
		{
			System.out.println("queue is full");
			return;
		}
		
		if(isQueueEmpty())
		{
			front = rear = 0;
		}
		else
		{
			rear = (rear +1) % capacity;
		}
		
		arr[rear] = element;
		System.out.println("Element Queued");
	}
	
	public Integer dequeue()
	{
		if(isQueueEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		
		int element = arr[front];
		
		if(front == rear)
		{
			front = rear = -1;
			return element;
		}
		
		front = (front +1) % capacity;
		return element;
	}
	
	public void display()
	{
		int i;
		if(isQueueEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		
		for(i=front; i!= rear; i = (i) % capacity)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print(arr[i] + " ");
		
		System.out.println();
	}
}

