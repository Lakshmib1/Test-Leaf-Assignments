package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
    int num = 11;
    int firstnum = 0;
    int secondnum = 1;
    int sum = 0;
    
    System.out.println(firstnum);
    System.out.println(secondnum);
	
    for(int i=2;i<num;i++)
    {
    	sum = firstnum+secondnum; 
    	System.out.println(sum);
    	firstnum = secondnum;
    	secondnum = sum; 
    	
    	
    
    }

	}

}
