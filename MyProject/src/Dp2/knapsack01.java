package Dp2;

public class knapsack01 {
	public static int knapsack(int[] weight,int value[],int maxWeight){
		int n = weight.length;
        int storage[] = new int[maxWeight+1];
                
        for(int i=0; i<n; i++){
            for(int j=maxWeight; j>=weight[i]; j--) 
            	storage[j] = Math.max(storage[j] , (value[i] + storage[j - weight[i]]));
        }
        
		return storage[maxWeight];
	}
	
}
