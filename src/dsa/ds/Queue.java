package dsa.ds;

public class Queue {
	private int front, rear, maxSize; //maxSize is capacity
	private String arr[];
	Queue(int maxSize) {
		this.front = -1; //queue created
		this.rear = -1;
		this.maxSize = maxSize;
		this.arr = new String[this.maxSize];
	}

	public boolean isFull() {
		if (rear == maxSize - 1) {
			return true;
		}
		return false;
	}

	public boolean enqueue(String data) {
		if (isFull()) {
			return false;
		} else {
			arr[++rear] = data;
			return true;
		}
	}

	public void display() {
		if (isEmpty())
			System.out.println("Queue is empty!");
		else {
			System.out.println("Displaying queue elements");
			for (int i = front; i <= rear; i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public boolean isEmpty() {
		if (front > rear)
			return true;
		return false;
	}

	public String dequeue() {
		if (isEmpty()) {
			return "empty";
		} else {
			String data = arr[this.front];
			arr[front++] = null; //since it's string arr
			return data;
		}
	}
}
