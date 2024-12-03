
public class BinarySearch {
	
	public static int binarySearch(int[] array, int target) {
		
		int top = array.length - 1;
		int bottom = 0;
		
		while(bottom <= top) {
			int middle = (bottom + top) / 2;
			
			if(array[middle] == target) {
				return middle;
			}
			else if(array[middle] > target) {
				top = middle -1;
			}
			else {
				bottom = middle + 1;
			}
			
			
		}
		
		return -1;
	}
	
}
