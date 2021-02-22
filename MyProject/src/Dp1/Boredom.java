package Dp1;

public class Boredom {

	public static int solve(int arr[],int n) {
		int dp[]=new int[1001];
		int freq[]=new int[1001];
		for(int i=0;i<n;i++) {
			freq[arr[i]]++;
		}
		dp[0]=0;
		dp[1]=freq[1];
		for(int i=2;i<=1000;i++) {
			dp[i]=Math.max(dp[i-1], dp[i-2]+i*freq[i]);
		}
		return dp[1000];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1 ,2 ,1 ,3 ,2 ,2 ,2 ,2 ,3};
		System.out.println(solve(arr,9));
	}

}
