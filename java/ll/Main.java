class Node
{
	int data;
	Node next;

	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class Main
{
	
	public static void print(Node head)
	{
		while(head != null)
		{
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println("null");
	}
	
	public Node insertHead(Node head, int x)
	{
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}

	public static Node insertEnd(Node head, int x)
	{
		Node currentNode = new Node(x);
		if(head == null)
		{
			return currentNode;
		}

		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}

		last.next = currentNode;
	
		return head;
	}

	public static Node insertPos(Node head, int pos, int x)
	{
		if(pos < 1) return head;
		if(pos == 1)
		{
			Node newNode = new Node(x);
			newNode.next = head;
			return newNode;
		}
		Node curr = head;
		for(int i =1; i < pos -1 && curr != null; ++i)
		{
			curr = curr.next;
		}
		if(curr == null)
		{
			return head;
		}
		Node newNode = new Node(x);
		newNode.next = curr.next;
		curr.next = newNode;
		return head;
	}
	public static Node deleteHead(Node head)
	{
		if(head == null) return null;
		
		Node temp = head;
		head = head.next;
		temp = null;
		return head;
	}

	public static Node deleteLast(Node head)
	{
		if(head == null)
		{
			return null;
		}
		if(head.next == null)
		{
			return null;
		}

		Node secondLast = head;
		while(secondLast.next.next != null)
		{
			secondLast = secondLast.next;
		}
		secondLast.next = null;
		return head;
	}

	public static Node deletePos(Node head, int pos)
	{
		if(head == null)
		{
			return null;
		}
		 if (pos == 0) 
		{
			return head.next;
		}
		
		Node posNode = head;
		for(int i = 1; posNode != null & i < pos - 1; ++i)
		{
			posNode = posNode.next;
		}

		if(posNode == null || posNode.next == null) return head;
		posNode.next = posNode.next.next;
		return head;
	}
	public static boolean isAva(Node head, int key)
	{
		Node curr = head;

		while(curr != null)
		{
			if(curr.data == key) return true;
			curr = curr.next;
		}
		return false;
	}
	
	public static Node updateNode(Node head, int prevVal, int newVal)
	{
		if(head == null) return null;

		Node curr = head;
		while(curr != null)
		{
			if(curr.data == prevVal)
			{
				curr.data = newVal;
				return head;
			}
			curr = curr.next;
		}
		return head;
	}

	public static Node reverse(Node head)
	{
		Node prev = null, curr = head , next;

		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	public static void main(String[] args)
	{
		Main m1 = new Main();
		Node head = new Node(10);
		head = m1.insertHead(head, 20);
		head = insertEnd(head, 30);
		head = insertPos(head, 2, 50);
		print(head);
		// head = deleteHead(head);
		// head = deleteLast(head);
		// head = deletePos(head, 2);
		head = updateNode(head, 50, 40);
		print(head);
		// System.out.println(isAva(head, 40));
	}
}