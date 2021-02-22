package Dp2;
import java.util.*;
public class MaxSumRectangle {
	
	public static int kadnes(int arr[]){
		int n=arr.length;
        int current=0;
		int bestSoFar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            current+=arr[i];
            bestSoFar=Math.max(current,bestSoFar);
            
            if(current<0){
                current =0;
            }
        }
        return bestSoFar;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int m=o.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=o.nextInt();
			}
		}
		
		int dp[];
		int maxSum=Integer.MIN_VALUE;
		for(int left=0;left<m;left++) {
			dp=new int[n];
			for(int right=left;right<m;right++) {
				for(int k=0;k<n;k++) {
					dp[k]+=a[k][right];
				}
		maxSum=Math.max(maxSum, kadnes(dp));
				
			}
		}
		System.out.println(maxSum);
		
		
	}

}
