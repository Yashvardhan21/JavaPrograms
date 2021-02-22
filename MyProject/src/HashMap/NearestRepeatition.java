package HashMap;
import java.util.*;


public class NearestRepeatition {
public static int minDistance(int[] arr){
        
        HashMap<Integer,Integer> map=new HashMap<>(); 
        //ArrayList<Integer> list=new ArrayList<Integer>();
        int n=arr.length;
        // int temp=0;
        int j=0;
        int res=Integer.MAX_VALUE;
        int x=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                // temp=arr[i];
                j=i;
                x=map.get(arr[i]);
                map.put(arr[i],i);
                if(j-x<res)
                    res=j-x;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return res;

	}
}


/*Sample Input 1:
6
1 3 1 5 4 3
Sample Output 1:
2
Sample Input 2:
7
5 47 82 4 4 6 2 
Sample Output 2:
1*/