package Dp1;
import java.util.*;
public class CoinTower {
	static boolean findWinner(int x, int y, int n) 
    { 
        // To store results 
        boolean[] dp = new boolean[n + 1]; 
       
        Arrays.fill(dp, false); 
      
        // Initial values 
        dp[0] = false; 
        dp[1] = true; 
       
        // Computing other values. 
        for (int i = 2; i <= n; i++) { 
       
            // If A losses any of i-1 or i-x 
            // or i-y game then he will 
            // definitely win game i 
            if (i - 1 >= 0 && dp[i - 1] == false) 
                dp[i] = true; 
            else if (i - x >= 0 && dp[i - x] == false) 
                dp[i] = true; 
            else if (i - y >= 0 && dp[i - y] == false) 
                dp[i] = true; 
       
            // Else A loses game. 
            else
                dp[i] = false; 
        } 
       
        // If dp[n] is true then A will 
        // game otherwise  he losses 
        return dp[n]; 
    } 
	public  String solve(int n,int x,int y){
		
		// Write your code here .
        String s1="Whis";
        String s2="Beerus";
		 if (findWinner(x, y, n) == true) 
            return s2;
             else
            return s1;
    }
}
