package BinaryTrees;

public class ConstructTreeFromPostOrderAndInorder {
	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
			int[] in){
		
			// Write your code here
        return getTreeFromPostorderAndInorder(post,in,0,post.length-1,0,in.length-1);
		
	}

    
    public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
			int[] in, int pS,int pE, int inS, int inE){
        
        if(inS>inE){
            return null;
        }
        
        int rootdata=post[pE];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
        
        int rootIndex=-1;
        for(int i=inS;i<=inE;i++){
            if(in[i]==rootdata){
                rootIndex=i;
                break;
            }
        }
        
        int lpS=pS;
        int linS=inS;
        int linE=rootIndex-1;
        int lpE=linE-linS+lpS;
        
        int rpS=lpE+1;
        int rpE=pE-1;
        int rinS=rootIndex+1;
        int rinE=inE;
        
        root.left=getTreeFromPostorderAndInorder(post,in,lpS,lpE,linS,linE);
	    root.right=getTreeFromPostorderAndInorder(post,in,rpS,rpE,rinS,rinE);
        return root;

        
        
    }
}
