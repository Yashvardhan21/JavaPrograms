package Dp2;

public class MinCostPath {
	
	public static int minCostPath(int input[][]) {
        int m=input.length;
        int n=input[0].length;
        int dp[][]=new int[m][n];
        dp[m-1][n-1]=input[m-1][n-1];
        for(int i=m-2;i>=0;i--){
            dp[i][n-1]=input[i][n-1]+dp[i+1][n-1];
        }
        for(int j=n-2;j>=0;j--){
            dp[m-1][j]=input[m-1][j]+dp[m-1][j+1];
        }
        
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=input[i][j]+Math.min(dp[i+1][j+1],Math.min(dp[i+1][j],dp[i][j+1]));
            }
        }
        
        return dp[0][0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{3, 4, 1, 2},	{2, 1, 8, 9},{4 ,7 ,8 ,1}};
		System.out.println(minCostPath(arr));
		

	}

}
