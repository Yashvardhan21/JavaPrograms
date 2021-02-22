package temp;

public class Practise {
	
	public static int fibDp(int n) {
		int dp[]=new int[n+1];
//		for(int i=0;i<n+1;i++) {
//			dp[i]=-1;
//		}
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<n+1;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibDp(6));

	}

}
