package temp;

import java.util.HashMap;

public class LongestUniqueSubstring {

	public static String findLargestUniqueSubstring(String str){
		
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
