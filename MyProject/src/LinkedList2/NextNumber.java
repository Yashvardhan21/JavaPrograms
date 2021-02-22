package LinkedList2;

public class NextNumber {
	public static Node<Integer> nextLargeNumber(Node<Integer> head) {
		Node<Integer> head1=reverse(head);
        // while(head1!=null){
        //     System.out.print(head1.data+" ");
        //     head1=head1.next;
        // }
        Node<Integer> temp=head1;
        Node<Integer> prev=null;
        int a=1;
        while(temp!=null){
            if(temp.data<9){
                temp.data+=a;
                a=0;
                break;
            }
            else{
                temp.data=0;
                prev=temp;
                temp=temp.next;
                a=1;
            }
        }

        if(a==1){
            Node<Integer> node=new Node<Integer>(1);
            prev.next=node;
            node.next=null;
        }

        head1=reverse(head1);
        return head1;        
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
