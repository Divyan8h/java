package session1;

public class insertionsort {
public static void main(String[] args) {
   int arr[]= {7,8,3,1,2};
   
   for(int i=1;i<arr.length;i++)
   {
	   int curr = arr[i];
	   int j = i-1;
	   while(j>=0 && curr < arr[j])
	   {
		   arr[j+1] = arr[j];
		   j--;
	   }
	   
	   arr[j+1] = curr;
   }
   
   for(int i=0;i<arr.length;i++)
   {
	   System.out.print(arr[i] + " ");
   }
}
}
