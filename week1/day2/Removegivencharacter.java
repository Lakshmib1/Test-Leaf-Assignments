package week1.day2;

public class Removegivencharacter {


	public static String removeChar(String str, char ch) {
		
		char ch1[] = str.toCharArray();
		
		String replacestring = str.replace(ch,' ');
		System.out.println(replacestring.replaceAll("\\s+",""));
		return replacestring;
		
		
	}
	
	public static void main(String[] args) {
		
		Removegivencharacter obj = new Removegivencharacter();
		obj.removeChar("testleaf",'a');
	}
}
