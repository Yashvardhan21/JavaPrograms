package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationalSum {
public static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int sum) {
		
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
   		int n=arr.length;  
        int k=0;
        int count=0;
        for(int i=1;i<=n-1;i++){
            if(arr[i-1]!=arr[i]){
                count++;
            }
            
        }
        int newArr[]=new int [count+1];               
        for(int i=1;i<=n-1;i++){
            if(arr[i-1]!=arr[i]){               
                newArr[k++]=arr[i-1];
            }
            
        }
        newArr[k++]=arr[n-1];
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        combinationSum(newArr,sum,0,list,res);
        return res;
		
	}
    
    public static void combinationSum(int[] arr, int sum,int si, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res){
        if(si==arr.length){
            if(sum==0){
                
                res.add(new ArrayList<Integer>(list));
                return ;
            }
            else{
                return;
            }
        }
        
        if(sum<0){
            return;
        }
    	 if(sum==0){
            res.add(new ArrayList<Integer>(list));
            return ;
        }
          
        
        combinationSum(arr,sum,si+1,list,res);
        int start=arr[si];
    	list.add(arr[si]);
        combinationSum(arr,sum-start,si,list,res);
        list.remove(list.size()-1);
        
    }
}
