import java.util.Scanner;

public class RepeatingCharacters
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine().toLowerCase();

		int[] freq = new int[256];
		
		char freqChar = '\0';
		for(int i =0; i < s.length(); ++i)
		{
			char c = s.charAt(i);
			freq[c]++;

			if(freq[c] == 2)
			{
				freqChar = c;
				break;
			}
		}
		if(freqChar != '\0')
		{
			System.out.println("First Repeating Character : " + freqChar);
		}else
		{
			System.out.println("No repeating character found");
		}
		sc.close();
	}
}