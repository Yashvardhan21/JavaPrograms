package temp;

import java.util.*;

public class A {
	public static void main(String args[]){
    	Scanner o=new Scanner(System.in);
      	int n=o.nextInt();
      	String s1=o.next();
      	String s2=o.next();
      	HashMap<Character, Integer> map=new HashMap<>();
      	for(int i=0;i<n;i++){
        	if(map.containsKey(s1.charAt(i))){
            	int freq=map.get(s1.charAt(i));
              	freq++;
              	map.put(s1.charAt(i),freq);
            }
            else{
          		map.put(s1.charAt(i),1);    
            }
        }
               
        int count=0;
        for(int i=0;i<n;i++){
        	if(map.containsKey(s2.charAt(i))){
            	int freq=map.get(s2.charAt(i));
              	if(freq>0) {
              		freq--;
              		map.put(s2.charAt(i),freq);
              	}
              	else {
              	count++;
              	}
              	
            }
            else{
          		//map.put(s1.charAt(i),1);
              count++;
            }
        }
        
        for(Integer i:map.values()) {
        	if(i>0) {
        		count++;
        	}
        }
        
        System.out.println(count);
        
        
    }

}
