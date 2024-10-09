
public class Queue {
	Node rear, front;
	int size = 0;

	public void enqueue(int data) {
		Node n = new Node(data);
		if (rear == null && front == null) {
			rear = front = n;
		} else {
			rear.next = n;
			rear = n;
		}
		size++;
	}

	public int dequeue() {
		if (size != 0) {
			size--;
			int value = front.data;
			front = front.next;
			if(front == null) {
				rear = null;
			}
			return value;
		} else {
			throw new IllegalStateException();
		}

	}
	
	public int peek() {
		if(front == null) {
			throw new IllegalStateException();
		}
		return front.data;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		size = 0;
		front = null;
		rear = null;
	}
	
	public boolean contains(int data) {
		Node n = front;
		
		while(n != null) {
			if(n.data == data) {
				return true;
			}
			n = n.next;
		}
		return false;
	}
	
	public void reverse() {
		Node previous = null, current = front, next;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
				
		rear = front;

		front = previous;
		
	}
	
	@Override
	public String toString() {
		String result = "";
		Node n = front;
		while(n != null) {
			result += n.data + " ";
			n = n.next;
		}
		
		return result;
	}
}
