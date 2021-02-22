package Dp2;

public class WaysToMakeCoinChange {
public static int countWaysToMakeChange(int denominations[], int value){
        
        int n=denominations.length;
        int dp[][]=new int [n+1][value+1];
        for(int i=0;i<=n;i++)
            dp[i][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=value;j++){
               dp[i][j]+= dp[i-1][j];
                if(j-denominations[i-1]>=0)
                dp[i][j]+=dp[i][j-denominations[i-1]];                
            }
        }
        return dp[n][value];

	}
}
