
public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(5);
		stack.push(2);
		stack.push(8);
		
		stack.push(6);
		stack.push(6);
		stack.push(6);
		
		stack.push(6);
		

		System.out.println("Peek: "+stack.size());
		System.out.println("Peek: "+stack.search(1));

		System.out.println("Peek: "+stack.contains(22));
		stack.clear();
		System.out.println("Peek: "+stack.size());

		
		System.out.println(stack.toString());
		
	}

}
