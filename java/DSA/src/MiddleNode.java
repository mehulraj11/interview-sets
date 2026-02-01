class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Correct print method (can be an instance method or static)
    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // For a newline
    }
}

public class MiddleNode {
    // Corrected push/insert function (static, returns the new head)
    public static Node push(Node head, int data) {
        // 1. Create a new Node
        Node newNode = new Node(data);

        // 2. Set the new node's next pointer to the current head
        newNode.next = head;

        // 3. Return the new node to become the new head of the list
        return newNode;
    }

    public static void main(String[] args) {
        // Start with an empty list (or the first element)
        Node head = new Node(5); // List: 5

        // Use the corrected push function to update 'head'
        head = push(head, 6); // List: 6 -> 5
        head = push(head, 7); // List: 7 -> 6 -> 5
        head = push(head, 8); // List: 8 -> 7 -> 6 -> 5
        head = push(head, 9); // List: 9 -> 8 -> 7 -> 6 -> 5
        head = push(head, 10); // List: 10 -> 9 -> 8 -> 7 -> 6 -> 5
        head = push(head, 10); // List: 10 -> 10 -> 9 -> 8 -> 7 -> 6 -> 5

        // Call the static print method
        Node.print(head);
    }
}