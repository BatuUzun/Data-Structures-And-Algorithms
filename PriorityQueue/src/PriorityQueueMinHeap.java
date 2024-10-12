
public class PriorityQueueMinHeap {
	int size = 0, capacity = 20;
	int[] heap = new int[capacity + 1];
	
	public void insert(int data) {
		heap[++size] = data;
		swim();
	}
	
	public void swim() {
		int i = size;
		while(i > 1) {
			if(heap[i] < heap[i/2]) {
				swap(i, i/2);
			}
			else {
				break;
			}
			
			i = i/2;
		}
	}
	
	public void heapify() {
		for(int i = size/2; i>= 1; i--) {
			sink(i);
		}
	}
	
	public void sink(int i) {
		int l;
		
		while(i*2 <= size) {
			l = i*2;
			if(size > l && heap[l + 1] < heap[l]) {
				l++;
			}
			if(heap[l] > heap[i]) {
				break;
			}
			
			swap(i, l);
			i = l;
		}
		
	}
	
	public void swap(int i, int k) {
		int temp = heap[i];
		heap[i] = heap[k];
		heap[k] = temp;
	}
	
	public void display() {
		for(int i = 1; i<=size; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
}
