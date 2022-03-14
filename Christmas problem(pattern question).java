package session1;

public class quiz {
	public static void main(String[] args) {
		
	
		   int n=5;
	        for(int i=1; i<=n; i++) {
	            for(int j=1; j<=(n-i); j++) {
	                System.out.print(" ");
	            }
	            //for top part of the tree
	            for(int j=1; j<=i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        //for mid part
	        for(int i=3; i<=n; i++) {
	            for(int j=1; j<=(n-i); j++) {
	                System.out.print(" ");
	            }

	            for(int j=1; j<=i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	       
	        //for last part of star
	                for(int i=3; i<=n; i++) {
	                    for(int j=1; j<=(n-i); j++) {
	                        System.out.print(" ");
	                    }
	                    //for stars-last
	                    for(int j=1; j<=i; j++) {
	                        System.out.print("* ");
	                    }
	                    System.out.println();
	                }
	               
	        //for bottom part
	                for(int i=1; i<=n; i++) {
	                    for(int j=1; j<=2; j++) {
	                        System.out.print(" ");
	                    }
	                    
	                    for(int j=1; j<=3; j++) {
	                        System.out.print("* ");
	                    }
	                    System.out.println();
	                }
}
}
