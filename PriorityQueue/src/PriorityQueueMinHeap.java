
public class PriorityQueueMinHeap {
	int size = 0, capacity = 20;
	int[] heap = new int[capacity];
	
	public void insert(int data) {
		heap[size++] = data;
		swim();
	}

	private void swim() {
		int i = size -1;
		while(i > 0) {
			if(heap[i] < heap[(i-1)/2]) {
				swap(i, (i-1)/2);
			}
			else {
				break;
			}
			i = (i-1)/2;
		}
	}
	
	public void heapify() {
		for(int i = (size-1)/2; i>=0;i--) {
			sink(i);
		}
	}

	private void sink(int i) {
		int k;
		
		while(i*2+1 < size) {
			k = i*2 + 1;
			
			if(size > k+1 && heap[k+1] < heap[k]) {
				k++;
			}
			if(heap[k] >= heap[i]) {
				break;
			}
			swap(i, k);
			i = k;
		}
	}

	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	public void display() {
		for(int i = 0;i<size;i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
}
