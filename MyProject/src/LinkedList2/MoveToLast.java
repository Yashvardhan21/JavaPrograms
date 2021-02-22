package LinkedList2;

public class MoveToLast {
public static Node<Integer> func(Node<Integer> head,int n) {
        
        Node<Integer> h1=null;
        Node<Integer> t1=null;
        Node<Integer> temp=head;
        Node<Integer> head1=null;
        Node<Integer> prev=null;
        
        while(temp!=null){
            if(temp.data==n){
                if(h1==null){
                    h1=new Node<Integer> (n);
                    t1=h1;
                    t1.next=null;
                }
                else{
                    t1.next=new Node<Integer>(n);
                    t1=t1.next;
                    t1.next=null;
                }
            }
            else{
                if(head1==null){
                    head1=new Node<Integer>(temp.data);
                    prev=head1;
                }
                else{
                    prev.next=new Node<Integer> (temp.data);
                    prev=prev.next;
                }
            }
            temp=temp.next;
        }
        prev.next=h1;
        return head1;
	}
}
