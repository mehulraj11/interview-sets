class Queue
{
	int front, rear,size;
	int[] arr;

	public Queue(int c)
	{
		arr = new int [c];
		front =0;
		rear = -1;
		size = 0;
	}
	public void enqueue(int val)
	{
		if(size == arr.length) return;
	
		rear = (rear +1) % arr.length;
		arr[rear] = val;
		size ++;
	}
	public int dequeue()
	{
		if(size == 0) return 0;
		
		int val = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return val;
	}
	public void display()
	{
		if(size == 0) return;
		for(int i =0; i< size; i++)
		{
			System.out.print(arr[(front + i) % arr.length] + " ");
		}
	}
	public static void main(String[] args)
	{
		Queue q = new Queue(5);
		q.enqueue(10);
        	q.enqueue(20);
        	q.enqueue(30);
		q.enqueue(40);
        	q.enqueue(50);

        	q.display();
 System.out.println("Dequeued: " + q.dequeue());
        q.enqueue(30);

q.display();
	}
}