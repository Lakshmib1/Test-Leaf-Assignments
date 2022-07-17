package week1.day2;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Isanagram2 {

	public static boolean isAnagram(String input1, String input2) 
	{

		char ch1[] = input1.toCharArray();
		char ch2[] = input2.toCharArray();
		boolean isa = false;

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for(int i=0;i<=ch1.length-1;i++)
		{
			if(ch1[i] == ch2[i])
			{
				isa = true;				
			}
		}
			
			if(!isa)
			{
				System.out.println("the value is not anagram");
			}
			else
			{
				System.out.println("the value is an anagram");
			}

		return isa;	
}


	public static void main(String[] args) {

		Isanagram2 obj = new Isanagram2();
		obj.isAnagram("stop", "post");

	}
}
