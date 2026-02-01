public class RearrangeBySign
{
	public static void main(String[] args)
	{
		int[] array = {3,1,-2,-5,2,-4};
		int pos = 0, neg = 1;
		int[] ans = new int[array.length];
		for(int i = 0; i < array.length; ++i)
		{
			if(array[i] >= 0)
			{
				ans[pos] = array[i];
				pos += 2;
			}else
			{
				ans[neg] = array[i];
				neg += 2;
			}
		}
		for(int i = 0; i < ans.length; ++i)
		{
			System.out.print(ans[i]+ " ");
		}
		
	}
}