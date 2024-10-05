
public class DoublyLinkedList {
	Node head;
	Node tail;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = tail = node;
		} else {
			node.previous = tail;
			tail.next = node;
			tail = node;
		}
	}

	public void insertAtBeginning(int data) {
		Node node = new Node(data);

		if (head != null) {
			head.previous = node;
			node.next = head;
			head = node;
		} else {
			head = tail = node;
		}
	}

	public void insertAtPosition(int position, int data) {
		if (head != null) {
			Node node = new Node(data);

			if (position == 0) {
				head.previous = node;
				node.next = head;
				head = node;
			} else {
				int current = 0;
				Node n = head;
				while (n.next != null && current < position - 1) {
					n = n.next;
					current++;
				}

				n.next.previous = node;
				node.next = n.next;
				n.next = node;
				node.previous = n;
			}

		}

	}

	public void deleteFromEnd() {
		if (head != null) {
			if (head.next == null) {
				head = tail = null;
			} else {
				tail = tail.previous;
				tail.next = null;
			}
		}
	}

	public void deleteFromBeginning() {
		if (head != null) {
			if (head.next == null) {
				head = tail = null;
			} else {
				head = head.next;
				head.previous = null;
			}
		}
	}

	public void deleteValue(int data) {
		if (head != null) {
			if (head.next == null) {
				head = tail = null;
			} else {
				Node n = head;
				while (n != null) {
					if (n.data == data) {
						if (n.next == null) {
							n.previous.next = null;
							tail = n.previous;
							n = null;

						} else if (n.previous == null) {
							n.next.previous = null;
							head = n.next;
							n = null;
						} else {
							n.previous.next = n.next;
							n.next.previous = n.previous;
							n = null;
						}
						break;

					}

					n = n.next;
				}
			}

		}

	}

	public void deleteAtPosition(int position) {
		if (head != null) {
			if (position == 0) {
				head = head.next;
				head.previous = null;
			} else {
				Node n = head;
				int current = 0;
				while (n != null && current < position) {
					n = n.next;
					current++;
				}
				if (n.next == null) {
					tail = n.previous;
					tail.next = null;
					n = null;
				} else {
					n.next.previous = n.previous;
					n.previous.next = n.next;
					n = null;
				}

			}

		}

	}

	public int search(int data) {
		int position = -1;

		if (head != null) {
			int current = 0;
			Node n = head;
			while (n != null) {
				if (n.data == data) {
					position = current;
					break;
				}
				n = n.next;
				current++;
			}
		}

		return position;
	}

	public int size() {
		int size = 0;

		if(head != null) {
			Node n = head;
			while(n != null) {
				size++;
				n = n.next;
			}
		}
		
		return size;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true; 
		}
		return false;
	}
	
	public int getValueAt(int position) {
		if(head != null) {
			Node n = head;
			int current = 0;
			
			while(n != null && current < position) {
				n = n.next;
				current++;
			}
			
			return n.data;
			
		}
		
		return -999999999;
	}
	
	public void reverse() {
		Node current = head, next;
		Node n;
		while(current != null) {
			next = current.next;
			
			n = current.previous;
			current.previous = current.next;
			current.next = n;
			
			current = next;
		}
		Node temp = tail;
		tail = head;
		head = temp;
	}

	@Override
	public String toString() {
		String output = "LR: ";
		Node n = head;

		while (n != null) {
			output += n.data + " ";
			n = n.next;
		}
		output += "\n";

		Node t = tail;
		output += "RL: ";

		while (t != null) {
			output += t.data + " ";
			t = t.previous;
		}

		return output;
	}

}
