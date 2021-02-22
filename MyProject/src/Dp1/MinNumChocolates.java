package Dp1;

public class MinNumChocolates {

public static int getMin(int arr[], int N){
        
        int dp[]=new int[N];
        dp[0]=1;
        for(int i=1;i<N;i++){
            dp[i]=1;
            if(arr[i]>arr[i-1]){
                dp[i]=1+dp[i-1];
            }
        }
        
        for(int i=N-1;i>0;i--){
            if(arr[i]<arr[i-1]){
                if(dp[i-1]<=dp[i]){
                    dp[i-1]=1+dp[i];
                }
            }
        }
        
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=dp[i];
        }
        
        return sum;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 4, 4, 6,};
		System.out.println(getMin(arr,4));

	}

}
