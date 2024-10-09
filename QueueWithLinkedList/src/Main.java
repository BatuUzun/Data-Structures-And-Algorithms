
public class Main {
	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		System.out.println(q.toString());
		
		q.reverse();
		q.enqueue(6);
		q.enqueue(7);
		q.dequeue();

		System.out.println(q.toString());

	}
}
