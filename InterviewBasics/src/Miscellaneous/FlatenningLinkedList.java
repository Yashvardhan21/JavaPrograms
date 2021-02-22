package Miscellaneous;

import java.util.Scanner;



public class FlatenningLinkedList {
	
	public static Node<Integer> Flattening (Node<Integer> root){
		if(root==null || root.right==null) {
			return root;
		}
		
		root.right=Flattening(root.right);
		
		root=merge(root,root.right);
		
		return root;
	}
	

	private static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		// TODO Auto-generated method stub
		Node<Integer> head=null;
		Node<Integer> tail=null;
		
		while(head1!=null && head2!=null) {
			if(head1.data<head2.data) {
				if(head==null) {
					head=head1;
					tail=head1;
				}
				else { 
					tail.next=head1;
					tail=tail.next;
				}
				head1=head1.next;
			}
			else {
				if(head==null) {
					head=head2;
					tail=head2;
				}
				else { 
					tail.next=head2;
					tail=tail.next;
				}
				head2=head2.next;
			}
		}
		
		if(head1==null) {
			tail.next=head2;
		}
		
		if(head2==null) {
			tail.next=head1;
		}
		

		return head;
	}


	public static Node<Integer> takeInput(){
		Node<Integer> head=null,tail=null;
		Scanner o=new Scanner(System.in);
		int data=o.nextInt();

		while(data!=-1) {
			Node<Integer> newnode=new Node<Integer>(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
				tail.next=newnode;
				tail=tail.next; 
			}
			data=o.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		//Node<Integer> temp=head;
		while(head!=null) {
			System.out.print(head.data+"->");
			head=head.next;
		}
		System.out.println();
	}	
}
