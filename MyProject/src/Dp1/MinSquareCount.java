package Dp1;

/*Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
That is, if N is 4, then we can represent it as : 
{1^2 + 1^2 + 1^2 + 1^2} and {2^2}. 
Output will be 1, as 1 is the minimum count of numbers required.
*/

public class MinSquareCount {
	
	public static int minCount(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;

        for(int i=4;i<=n;i++){
            dp[i]=i;
            for(int j=1;j<=i;j++){
                if(j*j<=i){
                    dp[i]=Math.min(dp[i],1+dp[i-j*j]);
                }
 
            }

        }

        return dp[n];

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minCount(4));

	}

}
