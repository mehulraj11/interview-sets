import java.util.Arrays;
public class LongestConsecutive
{
	public static void main(String[] args)
	{
		int[] array = {100,4,2,900,800,3};
		Arrays.sort(array);
		int count =1;
		int best = 1;
		for(int i= 1; i< array.length; ++i)
		{
			if(array[i] == array[i- 1])
			{
				continue;
			}else if(array[i] == array[i-1] + 1)
			{	
				count++;
			}
			else
			{
				best = Math.max(best, count);
				count = 1;
			}
		}
		System.out.println(best);
	}
}