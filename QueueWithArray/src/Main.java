
public class Main {
	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		/*q.enqueue(9);
		q.enqueue(12);
		q.enqueue(32);
		
		q.enqueue(54);*/
		System.out.println(q.toString());

		q.reverse();
		
		System.out.println(q.toString());
	}
}
