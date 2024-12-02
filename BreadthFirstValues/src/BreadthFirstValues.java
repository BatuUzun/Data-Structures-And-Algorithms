import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BreadthFirstValues {

	public static ArrayList<Node> depthFirstValues(Node node) {
		ArrayList<Node> result = new ArrayList<Node>();
		
		if(node != null) {
			Queue<Node> q = new ConcurrentLinkedQueue<Node>();
			q.add(node);
			
			while(!q.isEmpty()) {
				Node n = q.poll();
				result.add(n);
				
				if(n.left != null) q.add(n.left);
				if(n.right != null) q.add(n.right);
				
			}
			
		}
		
		return result;
	}

}
