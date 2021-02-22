package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintSpecificTreePattern {
	public static void printSpecificPattern(BinaryTreeNode<Integer>  root)
    {

        if(root==null){
            return ;
        }

        System.out.print(root.data+" ");
        if(root.left==null){
            return;
        }

        System.out.print(root.left.data+" "+root.right.data+" ");
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        q.add(root.left);
        q.add(root.right);

        BinaryTreeNode<Integer> first=null;
        BinaryTreeNode<Integer> second=null;

        while(!q.isEmpty()){
            try{
                first=q.remove();
                second=q.remove();

                System.out.print(first.left.data+" "+second.right.data+" ");
                System.out.print(first.right.data+" "+second.left.data+" ");

                q.add(first.left);
                q.add(second.right);
                q.add(first.right);
                q.add(second.left);
            }
            catch(Exception e){

            }
        }


    }
}
