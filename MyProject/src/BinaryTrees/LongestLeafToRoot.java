package BinaryTrees;

import java.util.ArrayList;

public class LongestLeafToRoot {

    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
        // Write your code here
        if(root==null){
            return new ArrayList<Integer>();
        }	

        ArrayList<Integer> left=longestRootToLeafPath(root.left);
        ArrayList<Integer> right=longestRootToLeafPath(root.right);
        left.add(root.data);
        right.add(root.data);
        if(left.size()>right.size()){
            return left;
        }
        else{
            return right;
        }

    }
}
