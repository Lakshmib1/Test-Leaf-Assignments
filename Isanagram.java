package week1.day2;

import java.util.Arrays;

public class Isanagram {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "ohlle";

		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		boolean flag = false;

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for(int i=0;i<=ch1.length;i++)
		{
			if(ch1[i]==ch2[i])
			{
				System.out.println("the string is anagram");
				flag=true;
				break;
			}
		}

		if(flag!=true)
		{
			System.out.println("the string is not a anagram");
		}
		/*	 if(ch1.equals(ch2))
	 {
		 System.out.println("the value is a anagram");
	 }
	 else
		 System.out.println("the value is not a anagram");*/

	}

}
