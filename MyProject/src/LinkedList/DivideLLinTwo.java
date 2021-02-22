package LinkedList;

public class DivideLLinTwo {
	 public static void make2List(Node<Integer> head) {
	        // Write your code here
	        // head=reverse(head);
	        // while(head!=null){
	        // System.out.print(head.data+" ");
	        // head=head.next;
	        // }

	        if(head==null || head.next==null){
	            System.out.println(head.data+" ");
	            return;
	        }

	        int i=0;
	        Node<Integer> temp1=head;
	        Node<Integer> list1=null;
	        Node<Integer> temp2=head.next;
	        Node<Integer> list2=null;
	        list1=temp1;
	            list2=temp2;
	        while(temp1!=null && temp2!=null){
	            
	            temp1.next=temp2.next;
	            temp1=temp1.next;
	            if(temp1!=null && temp2!=null){
	            temp2.next=temp1.next;
	            temp2=temp2.next;}
	        }

	        list1=reverse(list1);
	        list2=reverse(list2);
	        while(list1!=null){
	            System.out.print(list1.data+" ");
	            list1=list1.next;
	        }
	        System.out.println();
	        while(list2!=null){
	            System.out.print(list2.data+" ");
	            list2=list2.next;
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
}
