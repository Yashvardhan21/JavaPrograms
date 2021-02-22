package Test;

import java.util.*;
public class Test1 {
	//max profit app
	public static int maximumProfit(int budget[]) {
		// Write your code here

        int n=budget.length;
        int max=0;
        for(int i=0;i<n;i++){
           int count=0;
            for(int j=0;j<n;j++){
                if(budget[i]<budget[j] || budget[i]==budget[j]){
                    count++;
                }
            }
            int max1=budget[i]*count;
            if(max1>max)
                max=max1;
        }
        return max;
	}
	
	
	//find smallest substring
	
static final int no_of_chars = 256; 
    
    public static String findMinSubstringContainingString(String str, String pat){
        /* Your class should be named solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
          int len1 = str.length(); 
        int len2 = pat.length(); 
        int count=0;
      
     
        if (len1 < len2) 
        { 
            
            return null; 
        } 
      
        int hash_pat[] = new int[no_of_chars]; 
        int hash_str[] = new int[no_of_chars]; 
   
        for (int i = 0; i < len2; i++) 
            hash_pat[pat.charAt(i)]++; 
      
        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE; 
 
        for (int j = 0; j < len1 ; j++) 
        { 
    
            hash_str[str.charAt(j)]++; 
    
            if (hash_pat[str.charAt(j)] != 0 && 
                hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)] ) 
                count++; 
      
    
            if (count == len2) 
            { 
          
                while ( hash_str[str.charAt(start)] > hash_pat[str.charAt(start)] 
                    || hash_pat[str.charAt(start)] == 0) 
                { 
      
                    if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]) 
                        hash_str[str.charAt(start)]--; 
                    start++; 
                } 
      
              
                int len_window = j - start + 1; 
                if (min_len > len_window) 
                { 
                    min_len = len_window; 
                    start_index = start; 
                } 
            } 
        } 
      
     
        if (start_index == -1) 
        { 
     
        return null; 
        } 
   
        return str.substring(start_index, start_index + min_len);
        
    }
    
    //find equalSum pairs
    
    public static boolean findPairs(int[] arr){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return the desired output and don't print anything.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=arr[i]+arr[j];
                if(!map.containsKey(sum)){
                    map.put(sum , j);
                }
                else 
                    return true;

            }

        }
        return false;
    }
}
