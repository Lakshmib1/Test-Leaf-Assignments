package week1.day2;

import java.util.Arrays;

public class Minmaxintarray {

	public static void main(String[] args) {
	int[] arr = {10,20,11,9,8,0,21,22,43,45,67,21,12,56,-1};
	int arrlength = arr.length;
	
	Arrays.sort(arr);
	System.out.println("Min value of the array is "+arr[0]);
	System.out.println("Min value of the array is "+arr[arrlength-1]);
	}
	
	

}
