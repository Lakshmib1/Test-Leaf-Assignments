package week1.day2;

public class Countnoofwords {

	public static int countWords(String str) {
		
		char ch[] = str.toCharArray();
		int count =1;
		
		for(int i=0;i<=ch.length-1;i++)
		{
			if((ch[i] == ' ') && (ch[i+1] != ' '))
			{
				count++;
			}
				
		}
		
		System.out.println(count);
		return count;
		
		
	}
	public static void main(String[] args) {
		Countnoofwords obj = new Countnoofwords();
		obj.countWords("hello india is my country say it");

	}

}
