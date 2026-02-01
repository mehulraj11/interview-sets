public class LongestSubArrayWithGivenSum
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,1,1,1,1,1,1};
		int target = 6;
		int left =0, right =0;
		int n = array.length;
		int sum =0;
		int maxLen =0;
		while(right < n)
		{	
			sum += array[right];
			if(sum > target)
			{
				sum -= array[left];
				left++;
			}
			if(sum ==  target)
			{
				maxLen = Math.max(maxLen, right - left +1);
			}
			right ++;
		}
		System.out.println(maxLen);
	}
}