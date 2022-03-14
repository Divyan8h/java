package session1;
import java.util.*;


public class reverse_string {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("hello");
			
	for(int i=0;i<sb.length()/2;i++)
	{
		int first = i;
		int back = sb.length() - 1 - i;
		
		char frontChar = sb.charAt(first);
		char backChar = sb.charAt(back);
		
		sb.setCharAt(first ,backChar);
		sb.setCharAt(back, frontChar);
	}
	
	System.out.println(sb);
}
}
