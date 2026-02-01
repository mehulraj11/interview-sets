import java.util.*;

public class MajorityElement
{
	public static void main(String[] args)
	{
		HashMap <Integer, Integer> map = new HashMap<>();
	
		int[] array= {2,2,1,1,1,2,2};

		for(int num : array)
		{
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		System.out.println(map);

		int majority = -1;

		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > array.length /2)
			{
				majority = entry.getKey();
				break;
			}
		}

		System.out.println(majority);
	}
}