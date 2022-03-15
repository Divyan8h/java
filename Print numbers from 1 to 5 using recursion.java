package session1;
import java.util.*;


public class recursion1 {
	public static void num(int n)
	{
		//Base case
		if(n==6)
		{
			return;
		}
		System.out.print(n + " ");
		num(n+1);
	}
public static void main(String[] args) {
	int n = 1;
	num(n);
}
}
