package BinaryTrees;

public class MaxPathSumBetweenTwoLeaves {
	public static long maximumSumLeafPath(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		Res res=new Res();
		res.val=0;
		long ans=(long)maximumSumLeafPath(root,res);
		return res.val;
	}

	public static long maximumSumLeafPath(BinaryTreeNode<Integer> root, Res res) {
		if(root==null){
			return 0;
		}

		if(root.left==null && root.right==null){
			return root.data;
		}

		long ls=maximumSumLeafPath(root.left,res);        
		long rs=maximumSumLeafPath(root.right,res);

		if(root.left!=null && root.right!=null){
			res.val=(int)Math.max(res.val,ls+rs+root.data);

			return Math.max(ls,rs)+root.data;
		}

		if(root.left==null){
			return rs+root.data;
		} 
		else{
			return ls+root.data;
		}


	}

}

class Res{
	int val;
}

