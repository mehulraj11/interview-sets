package LinkedList;

class LinkedList
{
	Node head;
	
	public LinkedList()
	{
		this.head = null;
	}

	public void insertAtHead(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}

		Node current = head;
		while(current.next != null)
		{
			current = current.next;
		}
		current.next = newNode;
	}

	public void insertAfter(Node prevNode, int data)
	{
		if(prevNode == null) return;
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		
	}

	public void insertAtPosition(int pos, int data)
	{
		if(pos < 1) return;
		if(pos == 1)
		{
			insertAtHead(data);
			return;
		}
		Node newNode = new Node(data);
		Node current = head;

		for(int i =1; i< pos -1 && current != null; i++)
		{
			current = current.next;
		}
		if(current == null) return;
		
		newNode.next = current.next;
		current.next = newNode;
	}

	public void print()
	{
		Node temp = head;

		if(temp == null) return;
		while(temp != null)
		{	
			System.out.print(temp.data + (temp.next != null ? " -> " : ""));
			temp = temp.next;
		}
		System.out.println();
	}
	public Node recursiveReverse(Node head)
	{
		if(head == null || head.next == null) return head;

		Node newHead = recursiveReverse(head.next);
		Node curr = head.next;
		curr.next = head;
		head.next = null;

		return newHead;
	}
}