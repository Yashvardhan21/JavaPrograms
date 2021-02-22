package Backtracking;

public class LexicographicalOrder {
	 public static void lexicographicalOrder(int num){
	        // Write your code here
	        for(int i=1;i<=9;i++)
	            lexicographicalOrder( num,i);

	    }

	    public static void lexicographicalOrder(int num,int n){
	        // Write your code here
	        if(n>num){
	            return;
	        }
	        System.out.println(n);
	        int x=0;
	        for(int j=0;j<=9;j++){
	            x=10*n+j;
	            lexicographicalOrder(num,x);  

	        }

	    }
}
