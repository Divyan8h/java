package session1;

public class quiz2 {
public static void main(String[] args) {
	//selection sort
	int arr[] = {7,8,3,1,2};
	
	//outer loop
	for(int i=0;i<arr.length-1;i++)
	{
		//Inner loop
		int smallest = i;
		//j=i+1 - because all the elemnets before i is sorted
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[smallest]>arr[j])
			{
				smallest = j;
			}
		}
		int temp = arr[smallest];
		arr[smallest] = arr[i];
		arr[i] = temp;
	}
	
	for(int k=0;k<arr.length;k++)
	{
		System.out.print(arr[k] + " ");
	}
	System.out.println();
}
}
