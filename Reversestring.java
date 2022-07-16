package week1.day2;

public class Reversestring {

	public static void main(String[] args) {
	
		String str = "Lakshmi";
		char ch1[] = str.toCharArray();
		
		for(int i=ch1.length-1;i>=0;i--)
		{
			System.out.print(ch1[i]);
		}

		
		
	}

}
