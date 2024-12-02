
public class Main {

	public static void main(String[] args) {
		
		Node node = new Node('a');
		
		Node node1 = new Node('b');
		Node node2 = new Node('c');
		
		Node node3 = new Node('d');
		Node node4 = new Node('e');
		
		Node node5 = new Node('f');
		Node node6 = new Node('g');
		
		Node node7 = new Node('h');
		
		node.left = node1;
		node.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		node3.left = node7;
		
		
		System.out.println(DepthFirstValues.depthFirstValues(node));
		
	}

}
