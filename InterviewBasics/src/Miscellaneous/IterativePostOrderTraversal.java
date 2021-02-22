package Miscellaneous;

import java.util.*;
public class IterativePostOrderTraversal {
	public static void postOrder(BinaryTreeNode<Integer> root) {
			//Using 2-stack
		Stack<BinaryTreeNode<Integer> > s1=new Stack<>();
		Stack<BinaryTreeNode<Integer>> s2=new Stack<>();
		if(root==null){
			return;
		}
		s1.push(root);
		while(!s1.isEmpty()){
			BinaryTreeNode<Integer> node=s1.pop();
			s2.push(node);
			if(node.left!=null){
				s1.push(node.left);
			}
			if(node.right!=null){
				s1.push(node.right);
			}
		}

		while(!s2.isEmpty()){
			BinaryTreeNode<Integer> node=s2.pop();
			System.out.print(node.data+" ");
		}

	}

	//using 1-stack

	//	Stack<BinaryTreeNode<Integer> > s1=new Stack<>();
	//    // Stack<BinaryTreeNode<Integer>> s2=new Stack<>();
	//    if(root==null){
	//        return;
	//    }
	//    
	//    BinaryTreeNode<Integer> curr=root;
	//    while(curr!=null || !s1.isEmpty()){
	//        if(curr!=null){
	//    		s1.push(curr);
	//            curr=curr.left;
	//        }
	//        else{
	//            BinaryTreeNode<Integer> temp=s1.peek().right;
	//            if(temp==null){
	//                temp=s1.pop();
	//                System.out.print(temp.data+" ");
	//                while(!s1.isEmpty() && temp==s1.peek().right){
	//                    temp=s1.pop();
	//                    System.out.print(temp.data+" ");
	//                }
	//            }
	//            else{
	//                curr=temp;
	//            }
	//        }
	//    }


	//Iterative InOrderTraversal
	public static void InOrder(BinaryTreeNode<Integer> root) {
		Stack<BinaryTreeNode<Integer>> stack=new Stack<>();
		if(root==null) return;
		while(true) {
			if(root!=null) {
				stack.push(root);
				root=root.left;
			}
			else {
				if(stack.isEmpty()) return;
				root=stack.pop();
				System.out.println(root.data+" ");
				root=root.right;
			}		
		}
	}
	
	
	//Iterative PreOrder Traversal
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root==null){
            return ;
        }
        // System.out.print(root.data+" ");
        // preOrder(root.left);
        // preOrder(root.right);
        
        Stack<BinaryTreeNode<Integer>> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            BinaryTreeNode<Integer> node=s.pop();
            System.out.print(node.data+" ");
            if(node.right!=null){
                s.push(node.right);
            }
            if(node.left!=null){
                s.push(node.left);
            }
        }
        
	}
}
