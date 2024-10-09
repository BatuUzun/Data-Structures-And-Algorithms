import java.util.Stack;

public class Queue {
	int size = 0, capacity = 10, rear = 0, front = 0;
	int[] array = new int[capacity];

	public void enqueue(int data) {
		array[rear] = data;
		rear = (rear + 1) % capacity;
		if (size != capacity) {
			size++;
		}
	}

	public int deQueue() {
		if (size == 0) {
			throw new IllegalStateException();
		}
		int value = 0;
		value = array[front];
		front = (front + 1) % capacity;
		size--;
		return value;
	}

	public int peek() {
		if (size != 0)
			return array[front];
		else
			throw new IllegalStateException();
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public void clear() {
		rear = front = size = 0;
	}

	public boolean contains(int data) {
		if (size != 0) {
			int index = front;
			for (int i = 1; i <= size; i++) {
				if (array[index] == data) {
					return true;
				}
				index = (front + i) % capacity;
			}
		}

		return false;
	}
	
	public void reverse() {
		int index = front;
		Stack<Integer> s = new Stack<>();
		for(int i = 1; i <= size; i++) {
			s.add(array[index]);
			index = (front+i) % capacity;
		}
		
		front = rear = size = 0 ;
		
		while(!s.isEmpty()) {
			enqueue(s.pop());
		}
		
	}

	@Override
	public String toString() {
		String result = "";
		int index = front;
		for (int i = 1; i <= size; i++) {
			result += array[index] + " ";
			index = (front + i) % capacity;
		}

		return result;
	}

}
