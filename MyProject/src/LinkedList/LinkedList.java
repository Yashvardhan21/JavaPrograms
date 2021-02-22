package LinkedList;
import java.util.*;
public class LinkedList {
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

	public static int length(Node<Integer> head){
		//Your code goes here
		if(head==null){
			return 0;
		}
		int count=0;
		while(head!=null){
			count++;
			head=head.next;
		}
		return count;
	}

	public static void printIthNode(Node<Integer> head, int i){
		//Your code goes here
		if(head==null){
			return;
		}

		int c=0;
		while(head!=null){
			if(c==i){
				System.out.println(head.data);
			}
			c++;
			head=head.next;
		}
	}

	//delete 
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		//Your code goes here
		Node<Integer> temp=head;
		Node<Integer> t1=head;
		Node<Integer> t2=null;
		int i=0;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		if(pos>=count){
			return head; 
		}

		if(head==null){
			return null;
		}
		if(pos==0){
			t1=t1.next;
			return t1;
		}
		while(t1!=null){
			t2=t1;
			t1=t1.next;
			i++;
			if(i==pos){
				break;
			}

		}
		t2.next=t1.next;
		return head;
	}

	//recursive
	public static int lengthR(Node<Integer> head){
		if(head==null){
			return 0;
		}

		return 1+lengthR(head.next);
	}

	public static Node<Integer> insertR(Node<Integer> head, int data, int pos){

		Node<Integer> newNode=new Node<Integer>(data);
		if(pos==0){
			newNode.next=head;
			// head.next=newNode;
			return newNode;
		}

		if(head==null){
			return null;
		}

		head.next=insertR(head.next,data,pos-1);

		return head;

	}


	public static Node<Integer> deleteIthNodeRec(Node<Integer> head, int i){

		if(i==0){
			return head.next;
		}

		if(head.next==null){
			return head;
		}

		head.next=deleteIthNodeRec(head.next,i-1);
		return head;
	}
	
	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
        Node<Integer> head1=head;
        Node<Integer> temp=head;
        String s2="";
        while(temp!=null){
            s2+=temp.data;
            temp=temp.next;
        }
        Node<Integer> reversedList=reverse(head1);
        String s1="";
        
        
        while(reversedList!=null){
            s1+=reversedList.data;
            reversedList=reversedList.next;
        }
        
       
        //System.out.println(s1+" "+s2);
        
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
        
	}

    public static Node<Integer> reverse(Node<Integer> head){
    	Node<Integer> prev=null;
        Node<Integer> curr=head;
        Node<Integer> next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        
        return head;
    }
	
	public static void print(Node<Integer> head) {
		//Node<Integer> temp=head;
		while(head!=null) {
			System.out.print(head.data+"->");
			head=head.next;
		}
		System.out.println();
		//head=temp;
		//		while(head!=null) {
		//			System.out.print(head.data+"->");
		//			head=head.next;
		//}
	}

	public static Node<Integer> insert(Node<Integer> head,int data,int pos) {
		Node<Integer> newnode=new Node<Integer>(data);
		if(pos==0) {
			newnode.next=head;
			return newnode;
		}

		int i=0;
		Node<Integer> temp=head;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		return head;

	}

	public static void main(String[] args) {
		//		Node<Integer> node1=new Node<Integer>(5); 
		//		System.out.println(node1.data);
		//		System.out.println(node1.next);
		//		Node<Integer> node2=new Node<Integer>(10);
		//		node1.next=node2;
		//		System.out.println(node1.next);
		//		System.out.println(node2);

		//		Node<Integer> node1=new Node<Integer>(10);
		//		Node<Integer> node2=new Node<Integer>(20);
		//		Node<Integer> node3=new Node<Integer>(30);
		//		node1.next=node2;
		//		node2.next=node3;
		//		Node<Integer> head=node1;
		Node<Integer> head=takeInput();
		head=insert(head,80,0);
		print(head);
		//print(head);

	}

}
