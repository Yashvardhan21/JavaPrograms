package Backtracking;

public class ReturnSubsetsSumtoK {
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
        return subsetsSumK(input,0,k);

	}
    
    public static int[][] subsetsSumK(int input[],int si, int k) {
        if(si==input.length){
            if(k==0){
            int a[][]=new int[1][0];
            return a;
            }
            else{
                int b[][]=new int[0][0];
                return b;
            }
        }
       
        int start=input[si];
        int temp1[][]=subsetsSumK(input,si+1,k-start);
        int temp2[][]=subsetsSumK(input,si+1,k);
        int ans[][]=new int[temp1.length+temp2.length][];
        int l=0;
        for(int i=0;i<temp1.length;i++){
            ans[i]=new int[temp1[i].length+1];
            ans[i][0]=start;
            for(int j=1;j<temp1[i].length+1;j++){
                ans[l][j]=temp1[i][j-1];
                // return ans;
            }
            l++;
        }
        for(int i=0;i<temp2.length;i++){
            ans[l]=new int [temp2[i].length];
            for(int j=0;j<temp2[i].length;j++){
                ans[l][j]=temp2[i][j];
                // return ans;
            }
            l++;
        }
        
        return ans;
        
    }
}
