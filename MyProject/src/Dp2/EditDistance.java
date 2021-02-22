package Dp2;

public class EditDistance {
	public static int editDistance(String s1, String s2){		
		int m=s1.length();
        int n=s2.length();
        if(m==0){
            return n;
        }
        if(n==0)
        {
            return m;
        }
        
        if(s1.charAt(0)==s2.charAt(0)){
            return editDistance(s1.substring(1),s2.substring(1));
        }
        else{
            int op1=editDistance(s1,s2.substring(1));
            // int op2=editDistance(s1,s1.charAt(0)+s2);
            // int op3=editDistance(s1,s1.charAt(0)+s2.substring(1));
            // return 1+Math.min(op1,Math.min(op2,op3));
            int op2=editDistance(s1.substring(1),s2);
            int op3=editDistance(s1.substring(1),s2.substring(1));
            
            return 1+Math.min(op3,Math.min(op1,op2));
        }
        
    }
	
	
	//using dp
	

	public static int editDistancedp(String s1, String s2){
        
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }
        
        for(int j=0;j<=n;j++){
            dp[0][j]=j;
        }
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(m-i)==s2.charAt(n-j)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        
        return dp[m][n];
        
        

	}

}
