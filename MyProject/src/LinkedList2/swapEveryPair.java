package LinkedList2;

public class swapEveryPair {
	 public static Node<Integer> swapPair(Node<Integer> head) {
	        Node<Integer> h1=head;
	        Node<Integer> t1=null;
	        
	        if(head==null || head.next==null){
	            return head;
	        }
	        else{
	            t1=head.next;
	        }
	        t1.next=h1;
	        h1.next=null;
	        return t1;
	        
	        
	    }
	    
		public static Node<Integer> swapEveryPair(Node<Integer> head) {
			if(head==null || head.next==null){
	            return head;
	        }
	        
	        int count=0;
	        Node<Integer> head1=head;
	        Node<Integer> temp=head;
	        while(count!=1 && temp!=null){
	            count++;
	            temp=temp.next;
	        }
	        
	        Node<Integer> n1=temp.next;
	        temp.next=null;
	        head1=swapPair(head1);
	        temp=head1;
	        while(temp.next!=null){
	            temp=temp.next;
	        }
	        temp.next=swapEveryPair(n1);
	        return head1;
		}
}
