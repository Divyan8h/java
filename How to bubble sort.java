package session1;

public class buublesort {
public static void main(String[] args) {
	int arr[] = {7,8,3,1,2};
	
	//outer loop will be taking a  number
	for(int i=0;i<arr.length-1;i++)
	{
		//inner loop will shift the largest number in the end
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				//swapping to get the largest num at the end
				int temp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
    //printing our array in sorted way
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		
	}
}
}
