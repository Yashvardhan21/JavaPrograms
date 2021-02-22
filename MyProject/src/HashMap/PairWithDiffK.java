package HashMap;
import java.util.*;
public class PairWithDiffK {
	public static void findPairsDifferenceK(int[] input, int k){
        /* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */
        int n=input.length;
        int freq=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(input[i])){
                freq=map.get(input[i]);
                freq++;
                map.put(input[i],freq);
            }
            else{
                map.put(input[i],1);
            }
        }

        for(int j=0;j<n;j++){
            int l=j+1;
            if(k==0){
                if(map.containsKey(input[j])){
                    int t1=map.get(input[j]);
                    int count=((t1-1)*t1)/2;
                    while(count>0){
                        System.out.println(input[j]+" "+input[l]);
                        count--;
                    }
                    map.remove(input[j]);

                }}


            else{
                while(l<=n-1){
                    int x1=Math.abs(input[j]-input[l]);
                    if(map.containsKey(input[j])){
                       // int t1=map.get(input[j]);
                        k=Math.abs(k);
                        if(x1==k){
                            if(map.containsKey(input[l])){
                               // int t2=map.get(input[l]);
                                if(input[l]<input[j]){
                                    System.out.println(input[l]+" "+input[j]);                                
                                }                            
                                else{
                                    System.out.println(input[j]+" "+input[l]);
                                }

                                // map.remove(input[l]);
                            }
                        }

                    }
                    l++;
                }
            }

        }

    }
}

/*Sample Input 1 :
4 
5 1 2 4
3
Sample Output 1 :
2 5
1 4
Sample Input 2 :
4
4 4 4 4 
0
Sample Output 2 :
4 4
4 4
4 4
4 4
4 4
4 4*/
