package HashMap;
import java.util.*;

public class MakeStringsAnagram {
	 public static int makeAnagram(String s1,String s2){
	        

	        int n1=s1.length();
	        int n2=s2.length();
	        int freq=0;
	        HashMap<Character, Integer> map=new HashMap<>();
	        for(int i=0;i<n1;i++){
	            if(map.containsKey(s1.charAt(i))){
	                freq=map.get(s1.charAt(i));
	                freq++;
	                map.put(s1.charAt(i),freq);
	            }
	            else{
	                map.put(s1.charAt(i),1);
	            }
	        }

	        int a=0;
	        for(int i=0;i<n2;i++){
	            if(map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i))>0){
	                int temp=map.get(s2.charAt(i));
	                if(temp!=0){
	                    temp--;
	                    map.put(s2.charAt(i),temp);
	                }
	            }
	            else{
	                a++;
	            }
	        }



	        int c=0;
	        //System.out.println(c1);
	        for(Character A:map.keySet())
	            c+=map.get(A);
	        // int count=c1+c2;
	        return c+a;

	    }
}


/*Sample Input 1 :
cde 
abc
Sample Output 1 :
4
Sample Input 2 :
aab
aba
Sample Output 2 :
0*/