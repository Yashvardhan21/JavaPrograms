package Trees;

public class NodeHavingSumOfChildren {
	static int maxsum=0;
    static TreeNode<Integer> ansnode=null;
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        if(root==null){
            return null;
        }
        
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=root.children.get(i).data;
            maxSumNode(root.children.get(i));
        }
        
        if(sum>maxsum){
            maxsum=sum;
            ansnode=root;
        }
        
        return ansnode;
        
        
	}

}

/*Sample Input 1 :
5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
Sample Output 1 :
1*/