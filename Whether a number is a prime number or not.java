package session1;
import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			System.out.println("Not a prime number");
			break;
		}
		else	
		{
			System.out.println("A prime number");
		}
		
	}
}
}
