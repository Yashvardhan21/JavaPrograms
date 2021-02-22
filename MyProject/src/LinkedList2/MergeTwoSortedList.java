package LinkedList2;

public class MergeTwoSortedList {
	public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) {
		
        Node<Integer> t1=head1;
        Node<Integer> t2=head2;
        Node<Integer> h3=null;
        Node<Integer> t3=null;
        
        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                if(h3==null){
                    h3=t1;
                    t3=t1;
                    
                }
                else{
                    t3.next=t1;
                    t3=t3.next;
                }
                t1=t1.next;
            }
            else{
                if(h3==null){
                    h3=t2;
                    t3=t2;
                }
                else{
                    t3.next=t2;
                    t3=t3.next;
                }
                t2=t2.next;
            }
        }
        
        if(t1==null){
            t3.next=t2;
        }
    	if(t2==null){
            t3.next=t1;
        }
          return h3;
        
	}
}
