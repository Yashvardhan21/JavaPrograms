package Dp1;

import java.util.Arrays;

public class NoOfAps {
	public static int numOfAP(int arr[], int N) 
	{int m=(int)Math.pow(10, 5)+1;
		int min =Integer.MAX_VALUE; 
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) { 
			min = Math.min(min, arr[i]); 
			max = Math.max(max, arr[i]); 
		} 
		int dp[] = new int[N]; 
		int sum[] = new int[m-1]; 
		int ans = N + 1; 
                    for(int d=(min-max);d<=(max-min);d++) 
            	{ Arrays.fill(sum, 0); 
                        for (int i = 0; i < N; i++) 
                        { dp[i] = 1; 
            		 if (arr[i] - d >= 1 && arr[i] - d <= 1000000) 
                            dp[i] += (sum[arr[i] - d]); 

				ans += dp[i] - 1; 
				sum[arr[i]] += dp[i]; 
			} 
		} 

		return ans%m; 
	} 
}
