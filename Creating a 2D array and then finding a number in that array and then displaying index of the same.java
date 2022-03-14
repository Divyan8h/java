package session1;
import java.util.*;

public class array_2D {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	System.out.println("enter row number");
	int row = sc.nextInt();
	System.out.println("enter col number");
	int col = sc.nextInt();
	int arr[][] = new int[row][col];
	
	//using for loop to take 2D array as input
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			arr[i][j] = sc.nextInt();
		}
	}
	
	//using for loop to iterate in 2D array
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			
			if(arr[i][j] == num)
			{
			     System.out.println("Num found at index: " + i +" " + j);	
			}
		}
	}
}
}
