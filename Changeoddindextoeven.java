package week1.day2;

public class Changeoddindextoeven {

	public static void main(String[] args) {
	
		String str = "changeme";
		
		String output = "";
		
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(i%2==1)
			{
				output = output + Character.toUpperCase(ch[i]);
				
			}
			else
				output = output+ch[i];
				
		}
		System.out.println(output);
		

	}

}
