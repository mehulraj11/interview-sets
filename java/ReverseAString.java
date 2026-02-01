import java.util.Scanner;

public class ReverseAString
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			
			char[] arr = s.toCharArray();

			int left = 0, right = s.length()-1;

			while(left < right)
				{
					char temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;

					left ++;
					right --;
				}
			String reversed = new String(arr);
			System.out.println("Reversed String is : " + reversed);
		}
}