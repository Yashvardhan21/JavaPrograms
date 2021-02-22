package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNodeUse {
	
	//Recursion
	public static TreeNode<Integer> takeInput(Scanner o){
		
		System.out.println("Enter next node data");
		int n=o.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		System.out.println("Enter number of children " +n);
		int childnum=o.nextInt();
		for(int i=0;i<childnum;i++) {
			TreeNode<Integer> child=takeInput(o);
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s+=root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	//LevelWise
	public static TreeNode<Integer> takeInputLevelWise(){
		try (Scanner o = new Scanner (System.in)) {
			System.out.println("Enter root data ");
			int rootData=o.nextInt();
			TreeNode<Integer> root=new TreeNode<Integer>(rootData);
			Queue<TreeNode<Integer>> pendingNodes=new LinkedList<>();
			pendingNodes.add(root);
			while(!pendingNodes.isEmpty()) {
				TreeNode<Integer> frontNode=pendingNodes.remove();
				System.out.println("Enter the no. of children of "+frontNode.data);
				int n=o.nextInt();
				for(int i=0;i<n;i++) {
					System.out.println("Enter "+(i+1)+"th child of " +frontNode.data );
					int child=o.nextInt();
					TreeNode<Integer> childNode=new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.add(childNode);
				}
			}
			return root;
		}
	}

	public static TreeNode<Integer> takeInputLevelWise1(){
		Scanner o=new Scanner(System.in);
		System.out.println("Enter root data: ");
		int rootData=o.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			try {
				TreeNode<Integer> front=q.remove();
				System.out.println("Enter no. of children of "+front.data);
				int numChild=o.nextInt();
				for(int i=0;i<numChild;i++) {
					System.out.println("Enter "+(i+1)+"th child of "+front.data);
					int childData=o.nextInt();
					TreeNode<Integer> child=new TreeNode<Integer>(childData);
					front.children.add(child);
					q.add(child);
				}
				
			}
			catch(Exception e) {
				return null;
			}
		}
		return root;
	}
	
	public static void printLevelWise(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			//TreeNode<Integer> front=q.remove();
//			int n=q.size();
//			
//			while(n>0) {
				TreeNode<Integer> front=q.remove();
				String s=front.data+":";
				for(int i=0;i<front.children.size();i++) {
					s+=front.children.get(i).data+",";
					q.add(front.children.get(i));
				}
				System.out.println(s);
			//}
		}
	}
	
	public static int numNodes(TreeNode<Integer> root) {
		int count=1;
		if(root==null) {
			return 0;
		}
		
		for(int i=0;i<root.children.size();i++) {
			count+=numNodes(root.children.get(i));
		}
		return count;
	}
	
	public static int largest(TreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		
		int ans=root.data;
		for(int i=0;i<root.children.size();i++) {
			int childAns=largest(root.children.get(i));
			if(childAns>ans) {
				ans=childAns;
			}
		}
		return ans;
	}
	
	public static int Sum(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int sum=root.data;
		for(int i=0;i<root.children.size();i++) {
			int childSum=Sum(root.children.get(i));
			sum+=childSum;
		}
		
		return sum;
		
	}
	
	public static void printKDepthNodes(TreeNode<Integer> root,int k) {
		if(k<0) {
			return;
		}
		
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		
		for(int i=0;i<root.children.size();i++) {
			printKDepthNodes(root.children.get(i),k-1);
		}
		
	}
	
	public static void preOrder(TreeNode<Integer> root){
		if(root==null) {
			return;
		}
		
		System.out.print(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			preOrder(root.children.get(i));
		}
	}
	
	//Number of nodes greater than x
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here	
        if(root==null){
            return 0;
        }
        
        int count=0;
        int ans=root.data;
        if(ans>x){
            count++;
        }
        for(int i=0;i<root.children.size();i++){
            count+=numNodeGreater(root.children.get(i),x);
        }
        
        return count;

	}
	
	//height
	public static int height(TreeNode<Integer> root){
		if(root==null){
            return 0;
        }
        
        if(root.children.size()==0){
            return 1;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<root.children.size();i++){
            int h=height(root.children.get(i));
			max=Math.max(h,max);
        }
        
        return max+1;
        
        
	}
	
	//countLeaf Node
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
        if(root ==null){
            return 0;
        }
        
        if(root.children.size()==0){
            return 1;
        }
        
        int count=0;
        for(int i=0;i<root.children.size();i++){
            count+=countLeafNodes(root.children.get(i));
        }
        
        return count;
        }

	//post order
	public static void postOrder(TreeNode<Integer> root){
		
        if(root==null){
            return ;
        }
                
        for(int i=0;i<root.children.size();i++){
            postOrder(root.children.get(i));
        }
        // if(root.children.size()==0){
        //     System.out.print(root.data+" ");
        //     // return;
        // }
        System.out.print(root.data+" ");
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner o=new Scanner(System.in);
//		TreeNode<Integer> root=takeInput(o);
		TreeNode<Integer> root=takeInputLevelWise1();
//		printLevelWise(root);
//		System.out.println("Num of nodes="+numNodes(root));
//		System.out.println("Largest elem="+largest(root));
//		System.out.println();
//		System.out.println();
		//printKDepthNodes(root , 2);
		print(root);
//		TreeNode<Integer> node1=new TreeNode<>(3);
//		TreeNode<Integer> node2=new TreeNode<>(5);
//		TreeNode<Integer> node3=new TreeNode<>(9);
//		TreeNode<Integer> node4=new TreeNode<>(6);
//		//TreeNode<Integer> root=new TreeNode<>(4);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		System.out.println(root);
		//preOrder(root);

	}

}
