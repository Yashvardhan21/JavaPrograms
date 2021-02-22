package Trees;

public class ReplaceNodeWithDepthK {
	 public static void replaceWithDepthValue(TreeNode<Integer> root){
	        if(root==null){
	            return;
	        }

	        replaceWithDepthValue(root,0);
	    }

	    public static void replaceWithDepthValue(TreeNode<Integer> root,int depth){

	        // Write your code here
	        // int k=height(root);
	        try{
	            root.data=depth;
	            for(int i=0;i<root.children.size();i++){
	                // System.out.println(root.data);
	                replaceWithDepthValue(root.children.get(i),depth+1);
	            }
	             // System.out.println(root.data);
	        }
	        catch(Exception e){

	        }


	    }
	   
}


/*Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 : (Level wise, each level in new line)
0 
1 1 1 
2 2*/