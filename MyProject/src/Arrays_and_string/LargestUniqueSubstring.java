package Arrays_and_string;

import java.util.HashMap;

public class LargestUniqueSubstring {

	public static String findLargestUniqueSubstring(String str){
		/* Don't write main().
	     * Don't read input, it is passed as function argument.
	     * Return the answer.
	     * Taking input and printing output is handled automatically.
	     */
        int max=0;
        String smax="";
        int n=str.length();
        for (int i=0;i<str.length();i++){
            HashMap <Character,Integer> h=new HashMap<>();
            h.put(str.charAt(i),i);
            int j=i+1;
            int c=0;
            String t="";
            t=t+str.charAt(i);
            while (j<n && !h.containsKey(str.charAt(j))){
                c++;
                t=t+str.charAt(j);
                h.put(str.charAt(j),j);
                j++;
                
            }
            if (c>max)
            {
                max=c;
                smax=t;
            }
        }
        return smax;
	}
}

/*
 Sample Input:
abcdabceb
Sample Output:
dabce
 */
