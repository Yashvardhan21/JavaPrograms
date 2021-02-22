package Dp1;

public class LootHouse {

	public static int getMaxMoney(int arr[], int n){
        int dp[]=new int [n+1];
        dp[0]=arr[0];
        for(int i=2;i<n;i++){
            dp[1]=Math.max(arr[1],dp[i-2]);
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        
        return dp[n-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,10,100,10,5};
		System.out.println(getMaxMoney(arr,5));
	}

}
