package Dp2;

import java.util.Scanner;

public class MaxSquareWithAllZeros {
	
	public static int findMaxSquareWithAllZeros(int[][] input){
        int m=input.length;
        int n=input[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
			if(input[i][0]==0){
                dp[i][0]=1;
            }
            else{
                dp[i][0]=0;
            }
        }

        for(int j=0;j<n;j++){
			if(input[0][j]==0){
                dp[0][j]=1;
            }
            else{
                dp[0][j]=0;
            }
        }
        
        int max=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(input[i][j]==0){
                  	dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                	if(max<dp[i][j]){
                        max=dp[i][j];
                    }
                }
            }
        }
        return max;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int m=o.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=o.nextInt();
			}
		}
		
		System.out.println(findMaxSquareWithAllZeros(a));

	}

}
