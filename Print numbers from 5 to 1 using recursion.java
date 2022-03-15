package session1;
import java.util.*;


public class recursion1 {
	public static void num(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(n + " ");
		num(n-1);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int n = sc.nextInt();
	num(n);
}
}
