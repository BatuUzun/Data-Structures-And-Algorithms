
public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(5);
		stack.push(2);
		stack.push(8);
		
		stack.push(3);
		stack.push(4);
		stack.push(9);
		
				stack.push(66);


		
		
		
		System.out.println(stack.toString());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		stack.reverse();
		stack.push(6);
		stack.push(62);
		stack.push(61);


		System.out.println(stack.toString());

	}

}
