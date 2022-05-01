package JAVA_DEVELOPER;
import java.util.*;

public class P1 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter string -> ");
 	String s = sc.next();
 	char[] arr = new char[s.length()];
 	
 	for(int i=0;i<s.length();i++)
 	{
 		arr[i] = s.charAt(i);
 	}
 	
 	for(int i=0;i<s.length();i++)
 	{
 		System.out.print("Output -> " + arr[i] + " ");
 	}
}
}
