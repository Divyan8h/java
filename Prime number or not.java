package session1;
import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	int count=0;
	for(int i=2;i<num;i++)
	{
		if(num%i == 0)
		{
			count+=1;
			
		}
	}	
		if(count>0)
		{
			System.out.println("not a prime number");
		}
		else
		{
			System.out.println("a prime number");
		}
		
}
}
