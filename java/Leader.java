import java.util.ArrayList;
import java.util.Collections;
public class Leader
{
	public static void main(String[] args)
	{
		int[] array = {16,17,4,3,5,2};
		ArrayList<Integer> ans = new ArrayList<>();
		int n = array.length;
		ans.add(array[n-1]);
		int maxi = array[n-1];
		for(int i = n-2; i >= 0; i--)
		{
			if(array[i] >= maxi)
				{
					ans.add(array[i]);
					maxi = array[i];
				}
		}
		Collections.reverse(ans);
		System.out.println(ans);
	}
}