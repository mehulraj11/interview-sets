import java.util.Scanner;

public class Pallindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String s = sc.nextLine();

		int left =0, right = s.length()-1;
		int flag = 0;
		
		while(left < right)
			{
				if(s.charAt(left) != s.charAt(right))
					{	
						flag =0 ;
					}
				else
					{
						flag = 1;	
					}
				left ++;
				right --;
			}
		if(flag == 1)
		 	{
				System.out.println("Pallindrome");			
		 	}
		else
			{
				System.out.println("Not Pallindrome");	
			}
		
	}
}