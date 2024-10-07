
public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(5);
		stack.push(23);
		stack.push(46);
		
		stack.push(68);
		stack.push(345);
		stack.push(575);
		
		
		
		System.out.println(stack.toString());
		stack.reverse();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(stack.toString());


	}
}
