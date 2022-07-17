package week1.day2;

public class Removeduplicates {

	public static void main(String[] args) {
		String str = "Java learn Java and other language";
		
		int count = 0;
		String output = " ";
		String[] word = str.split(" ");
				
		for(int i=0;i<word.length;i++)
		{
			for (int j=0;j<i;j++)
			{
				
				if(word[i]==word[j])
				{
					count++;
					
				}
				
				if(count>=1)
				{
					str = str.replace(word[i]," ");
					//System.out.println(str);
				}
				count = 0;			
			}
			
		}
		System.out.println(str);	
		
	}

}
