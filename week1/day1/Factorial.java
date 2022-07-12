package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		int sum = 1;
		for (int i=1;i<=num;i++)
		{
			sum = sum * i;

		}
		System.out.println("factorial is "+num+ " is "+sum);
	}

}
