package HashMap;

import java.util.*;

public class PairSumTo0 {
	public static void PairSum(int[] input, int size) {


        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<input.length;i++)
        {
            if(map.containsKey(input[i]))
            {
                int temp=map.get(input[i]);
                map.put(input[i],temp+1);
            }else
            {
                map.put(input[i],1);

            }

        }


        for(int j=0;j<input.length;j++)
        {
            if(input[j]>=0)
            {
                int x=0-input[j];


                if(map.containsKey(-input[j]))
                {
                    for(int  k=0;k<map.get(-input[j]);k++){       
                        System.out.println(x+" "+(input[j]));
                    }



                }



            }

        }
    }
}


/*Sample Input:
5
2 1 -2 2 3
Sample Output :
-2 2
-2 2*/