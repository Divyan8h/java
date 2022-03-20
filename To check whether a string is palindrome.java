package session1;
import java.util.*;

public class strpalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String a = sc.next();
	int n = a.length();
	
	 boolean flag = true;
	 for(int i=0;i<n;i++)
	 {
		 if(a.charAt(i)!=a.charAt(n-1-i))//if not equal then break down which means it isn't a palindrome
		 {
			 flag = false;
			 break;
		 }
	 }
	 if(flag == true)
	 {
		 System.out.println("The string is a palindrome");
	 }
	 else
	 {
		 System.out.println("The string is not a palindrome");
	 }
}
}
