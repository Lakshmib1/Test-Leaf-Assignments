package week1.day2;

import java.util.Arrays;

public class Duplicatevalueinarray {

	public static void main(String[] args) {

		int arr[] = {10,20,11,9,8,0,21,22,43,45,67,21,12,56,-1,78,67,76,22,21,22,22,21,22,6,22};

		Arrays.sort(arr);

		for(int i=0;i<=arr.length-1;i++)
		{
			if (arr[i] == arr[i+1])
			{
				System.out.println("The value is a duplicate " +arr[i]);
			}

		}
	}

}


