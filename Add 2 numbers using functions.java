package session1;
import java.util.*;

public class addnum {
	public static void printSum(int a, int b)
	{
		int sum = (a + b);
		System.out.println("Sum is  : " + sum);
		return;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter Second number");
			int b = sc.nextInt();
			printSum(a,b);
		}
		
	}

}
