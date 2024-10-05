
public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.insert(5);
		linkedList.insert(2);
		linkedList.insert(6);
		linkedList.insert(8);
		linkedList.insert(1);
		linkedList.insert(0);
		
		/*linkedList.insertAtBeginning(11);
		linkedList.insertAtBeginning(15);
		
		linkedList.insertAt(89, 2);
		
		linkedList.deleteFromEnd();
		linkedList.deleteFromEnd();
		linkedList.deleteFromEnd();
		
		linkedList.deleteFromBeginning();*/
		System.out.println(linkedList.toString());
		System.out.println(linkedList.getValueAt(2));

		
		//linkedList.deleteValue(0);
		
		//linkedList.deleteAtPosition(5);
		
		

		System.out.println(linkedList.isEmpty());
	}

}
