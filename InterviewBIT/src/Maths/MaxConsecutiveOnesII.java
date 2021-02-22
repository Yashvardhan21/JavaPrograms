package Maths;

public class MaxConsecutiveOnesII {

	public static int maxConsecutiveOnes2(int[] arr) {
		int max=Integer.MIN_VALUE;
		int numzeros=0;
		int start=0;
		int k=1;
		for(int end=0;end<arr.length;end++) {
			if(arr[end]==0) {
				numzeros++;
			}
			
			while(numzeros>k) {
				if(arr[start]==0) {
					numzeros--;
				}
				start++;
			}
			
			max=Math.max(max, end-start+1);
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,0,0,1,1,1,1,1,0};
		System.out.println(maxConsecutiveOnes2(arr));


	}

}
