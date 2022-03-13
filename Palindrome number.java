package session1;

import java.util.Scanner;

public class pallindrome {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number: ");
				 int num = sc.nextInt();
				 int temp = num;
				 
				 int rev=0;
				 int last_digit;
				 while(num>0)
				 { 
				 last_digit = num%10;		 
				 rev = (rev*10) + last_digit;
				 num = num/10;
				 }
				 if(rev == temp)
				 {
					 System.out.println("A pallindrome number");
				 }
				 else
				 {
					 System.out.println("Not a pallindrome number");
				 }
	

}
}
