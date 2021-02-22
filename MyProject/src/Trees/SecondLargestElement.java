package Trees;

import Queue.QueueUsingLL;

public class SecondLargestElement {
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root)
    {
        if(root==null){
            return null;
        }
        
        int ans =0;
        int max=0;
        TreeNode<Integer> frontnode=null;
        TreeNode<Integer> ansnode=null;
        TreeNode<Integer> maxnode=null;
        QueueUsingLL<TreeNode<Integer>> q=new QueueUsingLL<>();
        q.enqueue(root);
        while(!q.isEmpty()){
            try{
            frontnode=q.dequeue();
            int num=frontnode.data;
            for(int i=0;i<frontnode.children.size();i++){
                q.enqueue(frontnode.children.get(i));
            }
                
            if(max==0){
                max=num;
                ans=num;
                maxnode=frontnode;
            }
            
            else if(max==ans && num<ans){
                ans=num;
                ansnode=frontnode;
            }
            else if (num>max){
               
                ans=max;
                max=num;
                ansnode=maxnode;
                maxnode=frontnode;
            }
            }
            catch(Exception e){}
            
        }
        
        return ansnode;
        
        
    }
}

/*Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
40*/
