package HashMap;
import java.util.*;

public class Max_freq_number {
	public static int maxFrequencyNumber(int[] arr){        
        HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
           int key=arr[i];
           if(map.containsKey(key)){
               int freq=map.get(key);
               freq++;
               map.put(key,freq);
           }
           else{
               map.put(key,1);
           }
           
               
       }
       
       int max=0;
       int res=-1;
       
       for(int i=0;i<arr.length;i++){
           if(max<map.get(arr[i])){
               res=arr[i];
               max=map.get(arr[i]);
           }
       }
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sze = s.nextInt();
		int[] arr = new int[sze];
		for(int index = 0;index<sze;index++){
			arr[index]=s.nextInt();
		}
		System.out.println(maxFrequencyNumber(arr));
	}
}



/*Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6 
Sample Output 1 :
2
Sample Input 2 :
3
1 4 5
Sample Output 2 :
1*/