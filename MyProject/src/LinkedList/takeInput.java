package LinkedList;

import java.util.Scanner;

public class takeInput {
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
//				Node<Integer> temp=head;
//				while(temp.next!=null) {
//					temp=temp.next;
//				}
//				temp.next=newnode;
				tail.next=newnode;
				tail=tail.next; //tail=newnode;
				
			}
			data=o.nextInt();
		}
		return head;
	}

}
