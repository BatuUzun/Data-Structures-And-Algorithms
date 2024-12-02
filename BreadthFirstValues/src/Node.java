
public class Node {
	char value;
	Node left;
	Node right;
	
	public Node(char value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
