import java.util.Scanner;

public class Vowels
{	
	public static int count(String s)
	{
		int freq = 0;
		for(int i = 0; i < s.length(); ++i)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
			{
				freq++;
			}	
		}
		return freq;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int freq = count(s);
		System.out.println(freq);
	}
}