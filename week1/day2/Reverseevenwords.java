package week1.day2;

import java.util.Iterator;

public class Reverseevenwords {

	public static void main(String[] args) {
		
		String str = "I am a software tester";
		
		String[] word = str.split(" ");
		for(int i =0;i<word.length;i++)
		{
			if(i%2==1)
			{
				StringBuilder sb = new StringBuilder(word[i]);
				System.out.println(sb.reverse()+ " ");
			}
			else
			{
				System.out.println(word[i]+ " ");
			}
		}

	}

}
