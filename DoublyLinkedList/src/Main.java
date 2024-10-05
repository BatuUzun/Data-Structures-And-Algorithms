

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		
		doublyLinkedList.insert(5);
		doublyLinkedList.insert(25);
		doublyLinkedList.insert(57);
		doublyLinkedList.insert(58);
		doublyLinkedList.insert(56);
		doublyLinkedList.insert(48);
		doublyLinkedList.insert(54);
		
		System.out.println(doublyLinkedList.toString());
		
		doublyLinkedList.reverse();
		
		System.out.println(doublyLinkedList.toString());
		
		

	}

}
