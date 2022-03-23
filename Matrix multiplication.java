package session1;
import java.util.*;

public class multmatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row no.");
		int n = sc.nextInt();
		System.out.println("enter col no.");
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int[][] par = new int[n][m];
		
		System.out.println("enter first matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				
				 arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("enter second matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				par[i][j] = sc.nextInt();
			}
		}
		
		int[][] kar = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				kar[i][j]= 0;
			}
		}
		
		for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            for(int k=0;k<m;k++)
	            {
	                kar[i][j]+=arr[i][k]*par[k][j];
	            }
	        }

	    }
		
		System.out.println("resultant matrix");
		for(int i=0;i<kar.length;i++)
		{
			for(int j=0;j<kar.length;j++)
			{
				System.out.print(kar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
