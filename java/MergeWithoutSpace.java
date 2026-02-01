import java.util.ArrayList;

public class MergeWithoutSpace
{
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,0,0,0};
		int[] arr2 = {2,5,6};

		int m = arr1.length;
		int n = arr2.length;
		ArrayList<Integer> ans = new ArrayList<>();
		int i = 0, k =0, j =0;
		while(i < m)
		{
			if(arr1[i] == 0)
			{
				i++;
				continue;
			}
			if(arr2[j] == 0)
			{
				j++;
				continue;
			}
			if(arr1[i] < arr2[j])
			{
				ans.add(arr1[i]);
				i++;
			}
			else
			{
				ans.add(arr2[j]);
				j++;
			}
		}
		System.out.println(ans);
		System.out.println(m);
	}
}