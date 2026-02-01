public class CountWords
{
	public static void main(String[] args)
	{
		String s1 = "Here are clear and concise differences and explanations for each aspect of Java Strings, StringBuffer, and StringBuilder, as well as answers to related questions about immutability, string pool, usage recommendations, and the intern() method.	";
		int count =0 ;
		
		for(int i =0; i<s1.length(); ++i)
			{
				char c = s1.charAt(i);
				if(c == ' ')
					{
						s1.charAt(i+1).toUpperCase();
					}
			}
		System.out.println(s1);
	}
}