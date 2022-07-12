package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		int num = 13;
		int m = num/2; 
		boolean flag = true;

		if(num==0||num==1)
		{
			System.out.println("number is not a prime number");
			flag=false;
		}
		for(int i =2;i<m;i++)
		{
			if (num%2==0)
			{
				System.out.println("number is not a prime number" +num);	
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("The entered number is a prime number " +num);	
		}
		
	}

}
