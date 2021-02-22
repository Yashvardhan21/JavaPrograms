package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		System.out.println("Enter root data");
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}

		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		root.left=takeInput(s);
		root.right=takeInput(s);
		return root;

	}

	public static void print(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}

		String s=root.data+":";

		if(root.left!=null) {
			s+="L"+root.left.data+",";
		}

		if(root.right!=null) {
			s+="R"+ root.right.data+",";
		}
		System.out.println(s);
		print(root.left);
		print(root.right);

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

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0; 
		}
		int ans=1;
		ans+=countNodes(root.left);
		ans+=countNodes(root.right);
		return ans;
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

	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}

		int op1=(height(root.left)+height(root.right));
		int op2=diameter(root.left);
		int op3=diameter(root.right);
		return Math.max(op1, Math.max(op2, op3));
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}

		return 1+Math.max(height(root.left), height(root.right));
	}

	public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
		if(root==null) {
			Pair<Integer,Integer> Output=new Pair<Integer,Integer>();
			Output.first=0;
			Output.second=0;
			return Output;
		}

		Pair<Integer,Integer> lo=heightDiameter(root.left);
		Pair<Integer,Integer> ro=heightDiameter(root.right);
		int height=1+Math.max(lo.first,ro.first);
		int op1=lo.first+ro.first;
		int op2=lo.second;
		int op3=ro.second;
		int Diameter=Math.max(op1, Math.max(op2, op3));
		Pair<Integer,Integer> Output=new Pair<Integer,Integer>();
		Output.first=height;
		Output.second=Diameter;
		return Output;

	}

	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}

		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}

	public static int maximum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}

		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}

	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}

		return Math.max(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}


	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}

		int maxLeft=maximum(root.left);
		int minRight=minimum(root.right);

		if(root.data<=maxLeft || root.data>=minRight) {
			return false;
		}

		boolean isLeftBST=isBST(root.left);
		boolean isRTBST=isBST(root.right);

		if(isLeftBST && isRTBST) {
			return true;
		}
		else {
			return false;
		}
	}


	public static Pair<Boolean,Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> root) {
		if(root==null) {
			Pair<Boolean,Pair<Integer,Integer>> output=new Pair<>();
			output.first=true;
			output.second=new Pair<Integer,Integer>();
			output.second.first=Integer.MAX_VALUE;
			output.second.second=Integer.MIN_VALUE;
			return output;
		}

		Pair<Boolean,Pair<Integer,Integer>> leftoutput=isBST2(root.left);
		Pair<Boolean,Pair<Integer,Integer>> rightoutput=isBST2(root.right);
		int min=Math.min(root.data, Math.min(leftoutput.second.first, rightoutput.second.first));
		int max=Math.max(root.data, Math.max(leftoutput.second.second, rightoutput.second.second));
		boolean isBST=(root.data<=rightoutput.second.first) && (root.data >leftoutput.second.second) 
				&& leftoutput.first && rightoutput.first;
		Pair<Boolean,Pair<Integer,Integer>> output=new Pair<>();
		output.first=isBST;
		output.second=new Pair<Integer,Integer>();
		output.second.first=min;
		output.second.second=max;
		return output;

	}

	public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root,int data){
		if(root==null) {
			return null;
		}

		if(root.data==data) {
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}

		ArrayList<Integer> leftoutput=getRootToNodePath(root.left,data);
		if(leftoutput!=null) {
			leftoutput.add(root.data);
			return leftoutput;
		}

		ArrayList<Integer> rightoutput=getRootToNodePath(root.right,data);
		if(rightoutput!=null) {
			rightoutput.add(root.data);
			return rightoutput;
		}

		else {
			return null;
		}

	}

	public static void main(String[] args) {
		//		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
		//		BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(2);
		//		root.left=node1;
		//		BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(3);
		//		root.right=node2;
		Scanner s=new Scanner(System.in);
				BinaryTreeNode<Integer> root=takeInputLevelWise();
		//BinaryTreeNode<Integer> root=takeInput1();
				printLevelWise(root);
//		print1(root);
		//		System.out.println("No.of nodes="+countNodes(root));
				System.out.println("Diameter="+heightDiameter(root).second);
				System.out.println("Height="+heightDiameter(root).first);
		//		//print(root);
		//		System.out.println("inOrder: ");
		//		inOrder(root);
		//		System.out.println("Binary tree is BST: "+isBST2(root).first);
		//		System.out.println("getRootToNodePath : "+getRootToNodePath(root,6));



	}

}
