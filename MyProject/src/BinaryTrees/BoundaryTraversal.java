package BinaryTrees;

public class BoundaryTraversal {
	public static void solve(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		leftnodes(root.left);
		leafnodes(root.left);
		leafnodes(root.right);
		rightnodes(root.right);
	}

	public static void leftnodes(BinaryTreeNode<Integer> root){
		if(root==null)
		{
			return;
		}
		if(root.left!=null){
			System.out.print(root.data+" ");
			leftnodes(root.left);
		}
		else if(root.right!=null){
			System.out.print(root.data+" ");
			leftnodes(root.right);
		}
	}

	public static void leafnodes(BinaryTreeNode<Integer> root){

		if(root==null)
		{
			return;
		}
		if(root.left==null && root.right==null){
			System.out.print(root.data+" ");
			//leafnodes(root.right);
		}
		leafnodes(root.left);
		leafnodes(root.right);
	}

	public static void rightnodes(BinaryTreeNode<Integer> root){
		if(root==null)
		{
			return ;
		}
		if(root.right!=null)
		{
			rightnodes(root.right);
			System.out.print(root.data+" ");
		}
		else if(root.left!=null)
		{
			rightnodes(root.left);
			System.out.print(root.data+" ");   
		}
	}
}