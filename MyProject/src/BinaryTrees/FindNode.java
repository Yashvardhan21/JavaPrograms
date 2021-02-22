package BinaryTrees;

public class FindNode {
	 public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
	        /* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/

	        if(root==null){
	            return false;
	        }

	        if(root.data==x){
	            return true;
	        }

	        if(isNodePresent(root.left,x) || isNodePresent(root.right,x)){
	            return true;
	        }
	        else{
	            return false;
	        }


	 }
}
