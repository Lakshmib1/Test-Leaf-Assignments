package week1.day2;

public class Countofstring {

	public static void main(String[] args) {
	String str = "Cognizant in India";
	char ch = 'n';
	int count =0;
	
	char ch1[] = str.toCharArray();
	
	for(int i=0;i<=ch1.length-1;i++)
	{
		if(ch1[i] == ch)
		{
			count++;
		}
	}
	System.out.println("the value " +ch+ " is repeated " +count+ " times");

	}

}
