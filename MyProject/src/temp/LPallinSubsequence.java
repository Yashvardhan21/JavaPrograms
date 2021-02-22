package temp;
import java.util.*;
public class LPallinSubsequence {

	
	    public static int solve(String A) {
	        int n=A.length();
	        // if(n==0 || n==1){
	        //     return n;
	        // }
	        
	        // else if(A.charAt(0)==A.charAt(n-1)){
	        //     return 2+solve(A.substring(1,n-1));
	        // }
	        
	        // else{
	        //     return Math.max(solve(A.substring(1)),solve(A.substring(0,n-1)));
	        // }
	        
	        int dp[][]=new int[n][n];
	        for(int i=0;i<n;i++){
	            dp[i][i]=1;
	        }
	        
	        for(int l=2;l<=n;l++){
	            for(int i=0;i<n-l+1;i++){
	                int j=i+l-1;
	                
	                if(l==2 && A.charAt(i)==A.charAt(j)){
	                    dp[i][j]=2;
	                }
	                else if(A.charAt(i)==A.charAt(j)){
	                    dp[i][j]=2+dp[i+1][j-1];
	                }
	                else{
	                     dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
	                }
	                
	            }
	        }
	        
	        return dp[0][n-1];
	        
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		System.out.println(solve("abcbc"));

	}

}
