import java.util.Random;

public class Main{
	public static void main(String[] argv) {
		/*PriorityQueueMaxHeap pqMax = new PriorityQueueMaxHeap();
		
		pqMax.insert(1);
		pqMax.insert(2);
		pqMax.insert(7);
		
		pqMax.insert(5);
		pqMax.insert(9);
		pqMax.insert(54);
	
		pqMax.insert(23);
		pqMax.insert(34);
		pqMax.insert(63);
		
		pqMax.insert(87);
		pqMax.insert(31);
		pqMax.insert(6);
		
		pqMax.insert(65);
		pqMax.insert(99);

		pqMax.display();

		pqMax.heapify();
		pqMax.display();*/

		//pq.deleteMax();
		
		/*pqMax.heapify();
		pqMax.display();*/
		
		PriorityQueueMinHeap pqMin = new PriorityQueueMinHeap();
		
		pqMin.insert(1);
		pqMin.insert(2);
		pqMin.insert(7);
		
		pqMin.insert(5);
		pqMin.insert(9);
		pqMin.insert(54);
	
		pqMin.insert(23);
		pqMin.insert(34);
		pqMin.insert(63);
		
		pqMin.insert(87);
		pqMin.insert(31);
		pqMin.insert(6);
		
		pqMin.insert(65);
		pqMin.insert(99);

		pqMin.display();

		
		pqMin.heapify();
		pqMin.display();
		
		/*Sort sort = new Sort();
		
		int[] randomNumbers = new int[10];
        
        // Create an instance of Random class
        Random random = new Random();
        
        // Fill the array with random numbers
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1000); // Generates a random number between 0 and 999
        }
        System.out.println("ORIGINAL:");
        sort.display(randomNumbers);
        
        System.out.println("ASDCENDING:");

        sort.maxHeapify(randomNumbers);
        sort.display(randomNumbers);

        System.out.println("DESCENDING:");
        

        sort.minHeapify(randomNumbers);
        sort.display(randomNumbers);
*/
        

	}
}