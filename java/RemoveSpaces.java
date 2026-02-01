public class RemoveSpaces
{
	public static void main(String[] args)
	{
		String str = "Hello i am mehul";
		String result = "";

		for(int i = 0; i < str.length(); ++i)
			{
				char c = str.charAt(i);
				if(c != ' ')
					{
						result += c;
					}
			}	
		System.out.println(result);	
	}
}