package session1;
import java.util.*;

public class num_in_arr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Size of array: ");
		int size = sc.nextInt();
		//declared an array
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//loop to iterate
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == num)
			{
				System.out.println("number found at index: " + i);
				break;
			}
			
		}
	}

}
