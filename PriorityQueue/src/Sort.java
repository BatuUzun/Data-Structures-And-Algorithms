
public class Sort {

	public void maxHeapify(int[] heap) {
		int size = heap.length;
		for (int i = size / 2 - 1; i >= 0; i--) {
			sinkMax(i, size, heap);
		}
		sortMax(heap, size);
	}

	private void sortMax(int[] heap, int size) {
		int i = size - 1;

		while (i > 0) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			sinkMax(0, i, heap);
			i--;

		}
	}

	private void sinkMax(int i, int size, int[] heap) {
		int k;
		while (i * 2 + 1 < size) {

			k = i * 2 + 1;

			if (size > k + 1 && heap[k + 1] > heap[k]) {
				k++;
			}
			if (heap[k] <= heap[i]) {
				break;
			}
			int temp = heap[i];
			heap[i] = heap[k];
			heap[k] = temp;

			i = k;
		}

	}

	private void sortMin(int[] heap, int size) {
		int i = size - 1;
		while(i > 0) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			
			sinkMin(0, i, heap);
			
			i--;
		}
	}
	
	private void sinkMin(int i, int size, int[] heap) {
		int k;
		while (i * 2 + 1 < size) {
			k = i * 2 + 1;

			if (size > k + 1 && heap[k + 1] < heap[k]) {
				k++;
			}
			if (heap[k] >= heap[i]) {
				break;
			}
			int temp = heap[i];
			heap[i] = heap[k];
			heap[k] = temp;

			i = k;

		}

	}

	public void minHeapify(int[] heap) {
		int size = heap.length;
		for (int i = size / 2 - 1; i >= 0; i--) {
			sinkMin(i, size, heap);
		}
		sortMin(heap, size);
	}

	public void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
