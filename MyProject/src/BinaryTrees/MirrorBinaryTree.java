package BinaryTrees;

public class MirrorBinaryTree {
public static void mirror(BinaryTreeNode<Integer> root){
		
        if(root==null){
            return ;
        }
        
        mirror(root.left);
        mirror(root.right);
        BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;

	}
}
