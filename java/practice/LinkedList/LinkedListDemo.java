package LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node demoNode; // To hold a specific node for insertAfter demo

        System.out.println("--- Insertion Examples ---");

        // 1. Insert at Head
        list.insertAtHead(10);
        list.insertAtHead(5);
        list.print();	

        // 2. Insert at End
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.print();

        // 4. Insert at Position 3 (insert 20)
        list.insertAtPosition(3, 20);
        list.print();

        // 3. Insert After (use the node with data 10)
        demoNode = list.head.next;
        list.insertAfter(demoNode, 15);
        list.print();

	list.head = list.recursiveReverse(list.head);
	list.print();
    }
}