import java.util.Scanner;

public class LargestElement
{	
	public static void print(int[] array)
	{
		for(int i =0; i<array.length; ++i)
		{
			System.out.print(array[i] +" ");
		}
	}

	public int max(int[] arr)
	{
		int max = arr[0];
		for(int i = 1 ; i < arr.length ; ++i)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public int min(int[] arr)
	{
		int min = arr[0];
		for(int i = 1; i< arr.length; ++i)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}

	private int[] reverse(int[] arr)
	{
		int left = 0, right = arr.length - 1;
		while(left < right)
		{
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;

			left ++;
			right --;
		}
		return arr;
	}
	
	public int sumOfAllElements(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i<arr.length; ++i)
		{
			sum += arr[i];
		}
		return sum;
	}

	public boolean isSorted(int[] arr)
	{
		for(int i = 1 ; i < arr.length ; ++i)
		{
			if(arr[i-1] < arr[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public void removeDuplicates(int[] arr)
	{
		int [] newArray = new int[arr.length];
		newArray[0] = arr[0];
		int i =0;
		for(int j =1; j<arr.length; ++j)
		{	
			if(arr[j] != newArray[i])
			{
				++i;
				newArray[i] = arr[j];
			}
		}
		print(newArray);
	}

	public int secondLargest(int[] arr)
	{
		int val = 0;
		int max = 0;
		
		for(int i =0; i<arr.length; ++i)
		{
			if(arr[i] > max)
			{
				val = max;
				max = arr[i];
			}
		}
	
		return val;	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] array = {4,9,2,3,1,8};
		LargestElement m1 = new LargestElement();
		// System.out.println(m1.max(array));
		// System.out.println(min(array));
		// m1.reverse(array);
		// System.out.println(m1.sumOfAllElements(array));
		// m1.removeDuplicates(array);
		// print(array);
		// System.out.println(m1.isSorted(array));
		System.out.println(m1.secondLargest(array));
	}
}