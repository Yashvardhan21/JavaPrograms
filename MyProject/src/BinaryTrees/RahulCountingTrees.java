package BinaryTrees;

import java.util.Scanner;

public class RahulCountingTrees {
	 public static void main(String args[]){
	        /* Write Your Code Here
	         * You have to take input and print the output yourself
	         */
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        long k=sc.nextLong();
	        long arr[]=new long[n+1];
	        for(int i=1;i<=n;i++)
	        {
	            arr[i]=sc.nextLong();
	        }
	        long dp[][]=new long[n+1][n+1];
	        for(int i=2;i<=n;i++)
	        {
	            int par=sc.nextInt();
	            dp[i][par]=1;
	            
	            for(int j=1;j<=n;j++)
	            {
	                if(dp[par][j]==1)
	                    dp[i][j]=1;
	            }
	        }
	        
	        long count=0;
	        for(int i=1;i<=n-2;i++)
	        {
	            for(int j=i+1;j<=n-1;j++)
	            {
	                for(int u=j+1;u<=n;u++)
	                {
	                    if(dp[u][i]==1&&dp[j][i]==1)
	                    {
	                        if(arr[i]+arr[j]+arr[u]>=k)
	                            count++;
	                    }
	                }
	            }
	        }    
	    System.out.println(count);
	    }
}
