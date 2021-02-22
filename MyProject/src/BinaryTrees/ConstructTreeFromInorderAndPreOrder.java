package BinaryTrees;

public class ConstructTreeFromInorderAndPreOrder {
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in){
		
			// Write your code here
        return getTree(pre,in,0,pre.length-1,0,in.length-1);
		
	}
    
    public static BinaryTreeNode<Integer> getTree(int pre[],int in[], int preS,int preE,int inS,int inE){
        if(inS>inE){
            return null;
        }
        
        int rootdata=pre[preS];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootdata);
        int rootIndex=-1;
        for(int i=inS;i<=inE;i++){
            if(in[i]==rootdata){
                rootIndex=i;
                break;
            }
        }
        
        int linS=inS;
        int linE=rootIndex-1;
        int lpreS=preS+1;
        int lpreE=linE-linS+lpreS;
        int rinS=rootIndex+1;
        int rinE=inE;    
        int rpreS=lpreE+1;    
        int rpreE=preE;    
            
        root.left=getTree(pre,in,lpreS,lpreE,linS,linE);
        root.right=getTree(pre,in,rpreS,rpreE,rinS,rinE);
        return root;
    }
}
