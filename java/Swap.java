import java.util.Scanner;

public class Swap
{
	public static void print(int a, int b)
	{
		System.out.println("a =" + " " + a +"\n" +"b = " + " " + b);
	}
	
	public static void operation(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first num : ");
		int a = sc.nextInt();

		System.out.print("Enter Second num : ");
		int b = sc.nextInt();
		
		System.out.println("Before Swapping");
		print(a, b);

		operation(a,b);

		System.out.println("After Swapping");
		print(a,b);			
	}

}