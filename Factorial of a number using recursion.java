package session1;

public class fact {
	public static void facto( int n,int factorial)
	{
		if(n==1)
		{
			factorial*=n;
			System.out.println(factorial);
			return;
		}
		factorial*=n;
		facto(n-1,factorial);
	}
public static void main(String[] args) {
	
	facto(4,1);
}
}
