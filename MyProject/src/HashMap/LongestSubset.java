package HashMap;
import java.util.*;

public class LongestSubset {
public static int max(int[] arr){
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
      
    
            map.put(0, -1); 
            int res =0; 
            int count0 = 0, count1 = 0; 
            for(int i=0; i<arr.length;i++) 
            { 
             
                if(arr[i]==0) 
                    count0++; 
                else
                    count1++; 
  
 
                if(map.containsKey(count1-count0)) 
                    res = Math.max(res, (i - map.get(count1-count0))); 
      
    
                else
                    map.put(count1-count0,i); 
                  
            } 
             return res;
    
	}
}
/*Sample Input 1 :
6 
1 0 0 1 1 1
Sample Output 1 :
4    
Sample Input 2 :
10 
1 1 1 0 0 0 1 1 0 0
Sample Output 2 :
10*/
