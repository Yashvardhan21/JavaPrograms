package Dp1;

public class LIS {

	public static int lis(int arr[]) {
		int n=arr.length;
		int dp[]=new int[n+1];
		dp[0]=1;
		int ans=Integer.MIN_VALUE;
		for(int i=1;i<n;i++){
			dp[i]=1;
			for(int j=i-1;j>=0;j--){
				if(arr[j]>=arr[i]){
					continue;
				}
				else{
					dp[i]=Math.max(1+dp[j],dp[i]);
					ans=Math.max(ans, dp[i]);
				}
			}
		}

//		int ans=Integer.MIN_VALUE;
//		for(int i=0;i<n+1;i++){
//			if(ans<dp[i]){
//				ans=dp[i];
//			}
//		}

		return ans;

	}	
	
	public static void main(String args[]) {
		int arr[]= {5, 4 ,11 ,1 ,16 ,8};
		System.out.println(lis(arr));
		
	}
}
