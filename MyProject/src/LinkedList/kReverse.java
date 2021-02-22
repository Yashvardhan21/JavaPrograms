package LinkedList;

public class kReverse {
	 public static Node<Integer> reverse(Node<Integer> head)
	    {

	        Node<Integer> prev=null;
	        Node<Integer> curr=head;
	        Node<Integer> temp=curr.next;
	        while(curr!=null)
	        {
	            temp=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=temp;                            
	        }
	        return prev;        

	    }

	    public static Node<Integer> kReverse(Node<Integer> head, int k) {
			
	        if(head==null || head.next==null){
	            return head;
	        }
	        Node<Integer> temp=head;
	        // int count=0;
	        // while(temp!=null){
	        //     count++;
	        //     temp=temp.next;
	        // }
	        
	        Node<Integer> head1=head;
	        Node<Integer> tail=head;
	        int i=0;
	        while(tail!=null && i!=k-1){
	            i++;
	            tail=tail.next;
	        }
	        
	        if(tail==null){
	            return reverse(head);
	        }
	        
	        Node<Integer> h1=tail.next;
	        tail.next=null;
	        head1=reverse(head1);
	        tail=head1;
	        while(tail.next!=null){
	            tail=tail.next;
	        }
	        
	        tail.next=kReverse(h1,k);
	        return head1;

	    }
}
