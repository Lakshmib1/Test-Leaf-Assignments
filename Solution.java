package week1.day2;

import java.util.Arrays;

public class Solution {

	public static String reverseLetters(String str)
	{
		// write your code here
		String str2 = str;
		char ch[] = str.toCharArray();

		String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}=";
		char ch2[] = specialCharacters.toCharArray();


		for(int i=ch.length-1;i>=0;i--)		
		{
			if (ch[i] == ch2[i])
			{
				i++;
				break;
			}
			else
			{
				System.out.print(ch[i]);

			}

		}
		return str;

	}

	public static void main(String[] args) {

		Solution obj = new Solution();
		obj.reverseLetters("ab-cd/");
	}
}


