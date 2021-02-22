package LinkedList;

import java.util.Scanner;

public class ReverseBetter {

	public static DoubleNode reverseBetter(Node<Integer> head) {
		if(head.next==null ) {
			DoubleNode ans=new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		
		DoubleNode smallans=reverseBetter(head.next);
		smallans.tail.next=head;
		head.next=null;
		smallans.tail=head;
		return smallans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		DoubleNode ans=reverseBetter(head);
		print(ans.head);
		

	}
	public static void print(Node<Integer> head) {
		//Node<Integer> temp=head;
		while(head!=null) {
			System.out.print(head.data+"->");
			head=head.next;
		}
		System.out.println();
		
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
				tail=tail.next; //tail=newnode;
			}
			data=o.nextInt();
		}
		return head;
	
	}
}
