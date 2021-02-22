package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

/*Sample Input 1:
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1 
Sample Output 1:
8 10 14
3 6 7 13
1 4
*/

public class PrintDiagonal {

//	public static void printDiagonal(BinaryTreeNode<Integer> root,int d, HashMap<Integer, ArrayList<Integer>> map) {
//		if(root==null) {
//			return;
//		}
//		
//		ArrayList<Integer> k=map.get(d);
//		if(k==null) {
//			k=new ArrayList<>();
//			k.add(root.data);
//		}
//		else {
//			k.add(root.data);
//		}
//		
//		map.put(d,k);
//		printDiagonal(root.left,d+1,map);
//		printDiagonal(root.right,d,map);
//		
//	}
	
	public static void printDiag(BinaryTreeNode<Integer> root,int d, HashMap<Integer, ArrayList<Integer>> map ) {
		if(root==null) {
			return;
		}
		
		ArrayList<Integer> k=map.get(d);
		if(k==null) {
			k=new ArrayList<>();
			k.add(root.data);
		}
		else {
			k.add(root.data);
		}
		map.put(d,k);
		printDiag(root.left,d+1,map);
		printDiag(root.right,d,map);
		
	}
	
	public static void printDiagonal(BinaryTreeNode<Integer> root) {
		HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
		printDiag(root,0,map);
		
		for(ArrayList<Integer> itr:map.values()) {
			for(int i=0;i<itr.size();i++) {
				System.out.print(itr.get(i)+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		printDiagonal(root);

	}


	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner o=new Scanner(System.in);
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<BinaryTreeNode<Integer>>();
		System.out.println("Enter root data");
		int rootData=o.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		q.add(root);

		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> front;
			front=q.remove();
			System.out.println("Enter the left child of "+front.data);
			int leftchild=o.nextInt();
			if(leftchild!=-1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(leftchild);
				q.add(child);
				front.left=child;
			}

			System.out.println("Enter the right child of "+front.data);
			int rightchild=o.nextInt();
			if(rightchild!=-1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(rightchild);
				q.add(child);
				front.right=child;
			}


		}
		return root;

	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> front=q.remove();
			String s=front.data+":";
			if(front.left!=null) {
				s+="L"+front.left.data+",";
				q.add(front.left);
			}
			if(front.right!=null) {
				s+="R"+front.right.data+",";
				q.add(front.right);
			}
			System.out.println(s);
		}
	}


}
