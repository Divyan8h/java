package session1;
import java.util.*;

public class transpose {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter row number");
	int n = sc.nextInt();
	System.out.println("enter column number");
	int m = sc.nextInt();
	int arr[][] = new int[n][m];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			arr[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("The transposr of a matrix: ");
	
	for(int j=0;j<m;j++)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}
}
