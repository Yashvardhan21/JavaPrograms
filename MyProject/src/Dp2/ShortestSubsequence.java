package Dp2;

public class ShortestSubsequence {
	 public int solve(String S,String V){
	        char s[]=S.toCharArray();
	        char t[]=V.toCharArray();
	        return solve(s,t);
	    }
	    static int max=1005;
	    public int solve(char s[],char t[]){
	        int m=s.length;
	        int n=t.length;
	        int dp[][]=new int [m+1][n+1];
	        for(int i=0;i<m+1;i++){
	            dp[i][0]=1;
	        }

	        for(int j=0;j<n+1;j++){
	            dp[0][j]=max;
	        }

	        for(int i=1;i<m+1;i++){
	            for(int j=1;j<n+1;j++){
	                int k;
	                for( k=j-1;k>=0;k--){
	                    if(t[k]==s[i-1]){
	                        break;
	                    }
	                }
	                if(k==-1){
	                    dp[i][j]=1;
	                }
	                else{
	                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i-1][k]);
	                }
	            }
	        }
	        return dp[m][n];
	        
	    }
}
