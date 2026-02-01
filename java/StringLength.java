import java.util.Scanner;

public class StringLength
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String : ");
		String str = sc.next();

		str += '\0';

		int length =0;

		while(str.charAt(length) != '\0')
		{	
			length++;
		}

		System.out.println(length);
	}
}