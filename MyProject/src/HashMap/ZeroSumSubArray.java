package HashMap;

import java.util.HashMap;

public class ZeroSumSubArray {
	public static boolean subarraySumTo0(int[] input) {
	      
        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0;
        for (int i=0;i<input.length;i++){
            sum=sum+input[i];
            if (sum==0 || h.containsKey(sum))
                return true;
            h.put(sum,1);
        }  
        return false;

    }
	
}

/*Sample Input 1 :
6 
7 1 3 -4 5 1
Sample Output 1 :
true
Sample Input 2 :
5 
-6 7 6 2 1
Sample Output 2 :
false*/
