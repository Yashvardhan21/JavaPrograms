package LinkedList2;

public class MergeSort {
	public static Node<Integer> mergeSort(Node<Integer> head) {
		// write your code here
		Node<Integer> temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(head==null || head.next==null){
            return head;
        }
        int mid=(count-1)/2;
        Node<Integer> head1=head;
        Node<Integer> head2=null;
        Node<Integer> tail1=head;
        int i=0;
        while(i<mid){
            i++;
            tail1=tail1.next;
        }
        head2=tail1.next;
        tail1.next=null;
        head1=mergeSort(head1);
        head2=mergeSort(head2);
        return mergeTwoList(head1,head2);
        // return head;
        
	}
    
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
