package week1.day2;

public class Findintersection {

	public static void main(String[] args) {
	
		int[] num1 = {1,2,3,4};
		int[] num2 = {2,4,7,8};
		int count = 0;
		
		for(int i=0;i<=num1.length-1;i++)
		{
			for(int j=0;j<=num2.length-1;j++)
			{
				if(num1[i]==num2[j])
					System.out.println(num1[i]);
				count++;
			}
		}
	}

}
