package session1;
import java.util.*;

public class average{
	static void average(int a, int b, int c)
	{
		int average = (a + b + c)/3;
		System.out.println("Average is:  " + average);
	}
	
   public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter first number");
	   int a = sc.nextInt();
	   System.out.println("Enter Second number");
	   int b = sc.nextInt();
	   System.out.println("Enter Third number");
	   int c = sc.nextInt();
	   average(a,b,c);
}
}


