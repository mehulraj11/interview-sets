package Stack;

class Stack
{
	int top = -1;
	final int size = 10;
	int[] stack = new int[size];

	public int push(int val)
	{
		if(top == (size -1))
		{
			return -1;	
		}
		stack[++top] = val;

		return 1;
	} 
	
	public int pop()
	{
		if(top == -1) return 0;
		
		int val = stack[top];
		top -= 1;
		return val;
	}
	
	public int top()
	{
		if(top == -1) return 0;

		return stack[top];
	}
	public int stackLen()
	{
		return (top + 1);
	}
	public static void main(String[] args)
	{
		Stack st = new Stack();
		System.out.println(st.push(1));
		System.out.println(st.push(2));
		System.out.println(st.push(3));
		System.out.println(st.push(4));
		System.out.println(st.push(5));
		System.out.println(st.top());
		System.out.println(st.stackLen());
		System.out.println(st.pop());
		System.out.println(st.top());
		System.out.println(st.stackLen());
		System.out.println(st.push(1));
		System.out.println(st.push(2));
		System.out.println(st.top());
		System.out.println(st.stackLen());
	}
}