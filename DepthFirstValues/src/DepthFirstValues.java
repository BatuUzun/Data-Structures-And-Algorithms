import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstValues {
	public static ArrayList<Node> depthFirstValues(Node node) {
		ArrayList<Node> result = new ArrayList<Node>();
		
		if(node != null) {
			Stack<Node> stack = new Stack<Node>();
			
			stack.push(node);
			
			while(!stack.isEmpty()) {
				Node current = stack.pop();
				result.add(current);
				
				node = current;
				
				if(node.right != null) stack.push(node.right);
				if(node.left != null) stack.push(node.left);
			}
		}
		
		
		
		return result;
	}
}
