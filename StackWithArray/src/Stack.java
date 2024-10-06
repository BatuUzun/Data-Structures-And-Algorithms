import java.util.EmptyStackException;

public class Stack {
	int size = 10;
	
	int[] array = new int[size];
	
	int top = 0;
	
	public void push(int data) {
		if(top < size) {
			array[top++] = data;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	public int pop() {
		if(top != 0) {
			top--;
		}
		
		int value = array[top];
		array[top] = 0;
		
		return value;
	}
	
	public int peek() {
		if(top == 0) {
			throw new EmptyStackException();
		}
		return array[top -1];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public int size() {
		return top;
	}
	
	public void clear() {
		for(int i = top -1; i >= 0; i--) {
			array[i] = 0;
			
		}
		top = 0;
	}
	
	public boolean contains(int data) {
		for(int i = top -1; i >= 0; i--) {
			if(array[i] == data) {
				return true;
			}	
		}
		return false;
	}
	
	public int search(int data) {
		for(int i = top -1; i >= 0; i--) {
			if(array[i] == data) {
				return i;
			}	
		}
		return -1;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(int i = top-1; i >= 0; i--) {
			result += array[i] + "\n";
		}
		
		return result;
	}
	
}
