package week1.day2;

public class Minmaxwithoutsort {

	public static void main(String[] args)
	{
		int[] arr = {10,20,11,9,8,0,21,22,43,45,67,21,12,56,1};
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if (arr[i] > min)
			{
				min =arr[i];

			}
			if(arr[i] < max)
			{
				max=arr[i];
			}
		}
		System.out.println("the maximum value is " +max);
		System.out.println("the minimum value is " +min);

	}

}
