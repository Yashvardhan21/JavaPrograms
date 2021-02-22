package Dp1;

import java.util.*;
import java.lang.*;

public class MinStepsToOne {
	
	public static int count(int n) {
		
		//Using Recursion
		
		if(n==1) {
			return 0;
		}
		
		int op1=count(n-1);
		int min=op1;
		for(int i=1;i<n;i++) {
			if(n%3==0) {
				int op2=count(n/3);
				if(min>op2) {
					min=op2;
				}
				
			}
			if(n%2==0) {
				int op3=count(n/2);
				if(min>op3) {
					min=op3;
				}
				
			}
		}
		
		return min+1;
		
		
	}
	
	
	
	public static int countM(int n) {
		int storage[]=new int[n+1];
		return countM(n,storage);
	}
	
	public static int countM(int n,int[] storage) {
		if(n==1) {
			storage[n]=0;
			return storage[n];
		}
		
		if(storage[n]!=0) {
			return storage[n];
		}
		
		int op1=countM(n-1,storage);
		int min=op1;
		for(int i=1;i<n;i++) {
			if(n%3==0) {
				int op2=countM(n/3,storage);
				if(min>op2) {
					min=op2;
				}
				
			}
			if(n%2==0) {
				int op3=countM(n/2,storage);
				if(min>op3) {
					min=op3;
				}
				
			}
		}
		
		storage[n]=min+1;
		return storage[n];
		
		
	}
	
	public static int countDP(int n) {
	int dp[]=new int [n+1];
	dp[1]=0;
	int min=Integer.MAX_VALUE;
	for(int i=2;i<=n;i++) {
		min=dp[i-1];
		if(i%3==0) {
			if(min>dp[i/3])
			{
				min=dp[i/3];
			}
			//dp[i]=Math.min(dp[i], dp[i/3]);
		}
		if(i%2==0) {
			if(min>dp[i/2])
			{
				min=dp[i/2];
			}
			//dp[i]=Math.min(dp[i],dp[i/2]);
		}
		dp[i]=min+1;
		
		
	}
	
	
	return dp[n];
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDP(400000000));
	}

}
