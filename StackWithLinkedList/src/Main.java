
public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(5);
		stack.push(23);
		stack.push(46);
		
		stack.push(68);
		stack.push(345);
		stack.push(575);
		
		stack.push(234);
		stack.push(57);
		stack.push(22);
		
		stack.push(11);
		stack.push(7);
		stack.push(9);
		
		
		System.out.println("Before");
		System.out.println(stack.toString());

		stack.clear();
	
		System.out.println("After");
		System.out.println(stack.toString());
		
		System.out.println("ADD");
		
		stack.push(11);
		stack.push(7);
		stack.push(9);
		
		System.out.println(stack.toString());
		System.out.println(stack.search(7));


	}
}
