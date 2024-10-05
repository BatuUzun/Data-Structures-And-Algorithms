
public class LinkedList {
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = new Node();
			n = head;
			
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
			
		}
	}
	
	public void insertAtBeginning(int data) {
		Node n = new Node();
		n.data = data;
		n.next = head;
		head = n;
	}
	
	public void insertAt(int data, int position) {
		if(position == 0) {
			insertAtBeginning(data);
		}
		else {
			Node node = new Node();
			node.data = data;
			
			Node n = new Node();
			n = head;
			
			int current = 0;
			
			while(n != null && current < position - 1) {
				n = n.next;
				current++;
			}
			Node tail = new Node();
			tail = n.next;
			node.next = tail;
			n.next = node;
		}
		
	}
	
	
	public void deleteFromEnd() {
		if (head != null) {
			Node n = head;
			if(n.next == null) {
				head = null;
			}
			else {
				while(n.next.next!=null) {
				n = n.next;
			}
			n.next = null;
			}
		}
		
	}
	
	public void deleteFromBeginning() {
		if(head != null) {
			head = head.next;
		}
	}
	
	public void deleteValue(int data) {
		if(head != null && head.data == data) {
			head = head.next;
		}
		else {
			Node n = head;
			
			while(n.next != null && n.next.data != data) {
				n = n.next;
			}
			if(n.next != null) {
				n.next = n.next.next;

			}
		
		}
	}

	public void deleteAtPosition(int position) {
		if(head != null) {
			if(position == 0) {
				head = head.next;
			}
			else {
				int current = 0;
				Node n = head;
				while(current < position -1 && n.next != null) {
					n = n.next;
					current++;
				}
				n.next = n.next.next;
			}
			
		}
		
	}
	
	public int search(int data) {
		
		if(head != null) {
			Node n = head;
			int position = 0;
			while(n.data != data && n.next != null) {
				n = n.next;
				position++;
			}
			if(n.next == null && n.data != data) {
				return -1;
			}
			return position;
		}
		
		return -1;
	}
	
	public int size() {
		int size = 0;
		
		if(head != null) {
			Node n = head;
			while(n != null) {
				n = n.next;
				size++;
			}
		}
		
		return size;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		return false;
	}
	
	public void reverse() {
		Node previous = null, current = head, next;
		
		while(current != null) {
			next = current.next;
			
			current.next = previous;
			
			previous = current;
			
			current = next;
		}
		head = previous;
	}
	
	public int getValueAt(int position) {
		
		Node n = head;
		int current = 0;
		int value = 0;
		
		while(n.next != null && current < position){
			n = n.next;
			current++;
		}
		if(current != position) {
			return -999999;
		}
		value = n.data;
		
		return value;
	}
	
	@Override
	public String toString() {
		String output = "";
		Node n = head;

		int a = 0;
		while(n != null) {
			output += n.data + "  ";
			n = n.next;
			a++;
			if(a > 50)
				break;
		}
		
		return output;
	}
	
	
}
