package session1;
import java.util.*;

public class fib {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no. of terms");
	int n = sc.nextInt();
	int a=0;
	int b=1;
	int c=0;
	System.out.print(a + " ");
	for(int i=2;i<n;i++)
	{
		System.out.print(b + " ");
		c=a+b;
		a=b;
		b=c;
		
	}
}
}
