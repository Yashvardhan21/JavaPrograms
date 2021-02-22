package BinaryTrees;

import java.util.*;

import Queue.QueueUsingLL;
public class LevelWiseLinkedList {
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		if(root==null){
            return null;
        }
        
        ArrayList<Node<BinaryTreeNode<Integer>>> ans=new ArrayList<Node<BinaryTreeNode<Integer>>>();
        Node<BinaryTreeNode<Integer>> head=null;
        Node<BinaryTreeNode<Integer>> tail=null;
        QueueUsingLL<BinaryTreeNode<Integer>> q=new QueueUsingLL<BinaryTreeNode<Integer>>();
        q.enqueue(root);
        q.enqueue(null);
        while(!q.isEmpty()){
            BinaryTreeNode<Integer> front;
            try{
                front=q.dequeue();
                if(front!=null){
                    Node<BinaryTreeNode<Integer>> newnode=new Node<BinaryTreeNode<Integer>>(front);
                    if(head==null && tail==null){
                        head=newnode;
                        tail=newnode;
                    }else{
                        tail.next=newnode;
                        tail=tail.next;
                    }
                    
                    if(front.left!=null){
                        q.enqueue(front.left);
                    }
                    
                    if(front.right!=null){
                        q.enqueue(front.right);
                    }
                    
                }
                
                if(front==null){
                    tail.next=null;
                    ans.add(head);
                    head=null;
                    tail=null;
                    if(!q.isEmpty()){
                        q.enqueue(null);
                    }
                }
            }
            catch(Exception e){
                return null;
            }
        }
        return ans;
        
    }
}
