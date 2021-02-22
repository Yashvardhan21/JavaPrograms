package BinaryTrees;

public class Traversal {
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}

		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}
	
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Print output and don't return it.
		* Taking input is handled automatically.
		*/
		if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
	}
	
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Print output and don't return it.
		* Taking input is handled automatically.
		*/
        
        if(root==null){
            return;
        }
        
        
        postOrder(root.left);
        postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	
}
