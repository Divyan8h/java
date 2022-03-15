package session1;

public class sumofn {
	public static void sumn(int i, int n, int sum)
	{
		if(i==n)
		{
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		sumn(i+1,n,sum);
	}
public static void main(String[] args) {
	sumn(1,10,0);
}
}
