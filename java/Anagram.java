import java.util.Scanner;

public class Anagram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First String : ");
		String s1 = sc.nextLine();

		System.out.print("Enter Second String : ");
		String s2 = sc.nextLine();
		
		if(s1.length() != s2.length())
		{
			System.out.print("Not Anagram");
			return;
		}
		
		int[] freq = new int[26];
		s1.toLowerCase();
		s2.toLowerCase();

		for(int i =0; i < s1.length(); i++)
		{
			char temp = s1.charAt(i);
			freq[temp - 'a']++;
		}

		for(int i =0; i<s2.length(); ++i)
		{
			char temp = s2.charAt(i);
			freq[temp - 'a']--;
		}
		boolean check = false;
		for(int i=0; i<freq.length; ++i)
		{
			if(freq[i] != 0)
				{
					check = true;
					break;			
				}
		}
		if(check)
		{
			System.out.print("Not Anagram");	
		}else
		{
			System.out.print("Anagram");
		}
	}
}