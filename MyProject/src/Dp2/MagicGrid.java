package Dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicGrid {

	public static void main(String[] args) throws IOException {
		// Write your code here
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            String s=br.readLine();
            String str[]=s.split(" ");
            int r=Integer.parseInt(str[0]);
            int c=Integer.parseInt(str[1]);
           int mat[][]=new int [r+1][c+1];
            for(int i=0;i<r;i++){
                 s=br.readLine();
                  str=s.split(" ");
                for(int j=0;j<c;j++){
                    mat[i+1][j+1]=Integer.parseInt(str[j]);
                    
                }
            }
            int dp[][]=new int [r+1][c+1];
            dp[r][c]=1;
            for(int i=r;i>0;i--){
                for(int j=c;j>0;j--){
                    if(i==r && j==c)
                        continue;
                    dp[i][j]=Integer.MAX_VALUE;
                    if(i+1<=r){
                       dp[i][j]=Math.min(dp[i][j],0-mat[i][j]+dp[i+1][j]); 
                    }
                    if(j+1<=c)
                    dp[i][j]=Math.min(dp[i][j],0-mat[i][j]+dp[i][j+1]);
                    if(dp[i][j]<=0)
                        dp[i][j]=1;
                }
            }
            System.out.println(dp[1][1]);
        }
	}
}
