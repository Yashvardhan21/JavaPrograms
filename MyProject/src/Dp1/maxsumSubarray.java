package Dp1;

public class maxsumSubarray {

	public static int findSum(int arr[],int n){
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

		int arr[]= {1,-4,2,6,7,-2,5};
		System.out.println(findSum(arr,7));
	}

}
