public class SetZero
{
	public static void main(String[] args)
	{
		int row = -1, col =-1;
		int[][] arr = 	{{1,1,1},{1,0,1},{1,1,1}};
		for(int i = 0; i< arr.length; i++)
		{
			for(int j =0; j < arr[i].length; j++)
			{
				if(arr[i][j] == 0)
				{
					row = i;
					col = j;
					break;
				}
			}
		}
			for(int i =0; i<arr.length; ++i)
			{
				arr[row][i] = 0;
			}
			for(int i =0; i<arr.length; ++i)
			{
				arr[0][col] = 0;
			}
		for(int i = 0; i< arr.length; i++)
		{
			for(int j =0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}