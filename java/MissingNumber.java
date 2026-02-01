import java.util.HashMap;

public class MissingNumber
{
	public static void mergeTwoSorted()
	{
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2, 4, 6};
		int[] newArray = new int[arr1.length + arr2.length];
		int left = 0, right =0, i =0;
		while(left < arr1.length-1 && right < arr2.length-1 )
		{
			if(arr1[left] < arr2[right])
			{
				newArray[i] = arr1[left];
				++i;
				left++;
			}else
			{
				newArray[i] = arr2[right];
				++i;
				right++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {4, 2, 4, 5, 2, 3, 5};
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int num : arr)
		{
			if(map.containsKey(num))
			{
				System.out.println("Duplicate : "+ num);
			}else
			{
				map.put(num, 1);
			}
			
		}	
		
	}
}