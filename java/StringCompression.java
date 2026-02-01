import java.util.Scanner;

public class StringCompression
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();

		int count = 1;
		StringBuilder result = new StringBuilder();
		for(int i = 1; i<str.length(); ++i)
		{
				if(str.charAt(i) == str.charAt(i - 1))
				{
						count ++;
				}else
				{
					result.append(str.charAt(i-1));
					result.append(count);
					count = 1;
				}
		}
		result.append(str.charAt(str.length() - 1));
		result.append(count);

		System.out.println(result);
	}
}