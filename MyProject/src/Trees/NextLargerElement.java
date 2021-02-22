package Trees;

public class NextLargerElement {
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

        // Write your code here

        if(root==null){
            return null;
        }

        TreeNode<Integer> ans=null;
        if(root.data>n){
            ans=root;
        }

        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> temp=findNextLargerNode(root.children.get(i),n);
            if(ans==null){
                ans=temp;
            }
            try{
                if(ans.data>temp.data){
                    ans=temp;
                }
            }
            catch(Exception e){

            }
        }
        
        return ans;

    }
}

/*Sample Input 1 :
18
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
20
Sample Input 2 :
21
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 2:
30*/
