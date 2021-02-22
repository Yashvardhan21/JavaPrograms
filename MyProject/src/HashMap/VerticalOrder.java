package HashMap;



import java.util.ArrayList;

import BinaryTrees.BinaryTreeNode;

import java.util.*;

public class VerticalOrder {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */
public static void gethd(BinaryTreeNode<Integer> root,TreeMap<Integer,ArrayList<Integer>> h,int hd){
    
    if(root==null){
        return;    
    }
   if (!h.containsKey(hd)){
       ArrayList<Integer> temp=new ArrayList<>();
       temp.add(root.data);
       h.put(hd,temp);
   }
    else{
      ArrayList<Integer> temp=h.get(hd);
        temp.add(root.data);
        h.put(hd,temp);
    }
   
    gethd(root.left,h,hd-1);
    gethd(root.right,h,hd+1);
    
}
	public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        TreeMap <Integer,ArrayList<Integer>> h=new TreeMap<>();
        gethd(root,h,0);
        for (int key:h.keySet()){
            ArrayList<Integer> temp=h.get(key);
            for (int j=0;j<temp.size();j++)
                System.out.print(temp.get(j)+" ");
            System.out.println();
        }
		
	}



}


/*Sample Input :
1 2 3 4 5 6 7 -1 8 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output :
7 
3 
4 
2 8 
1 5 6 */