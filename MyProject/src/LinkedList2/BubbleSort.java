package LinkedList2;

public class BubbleSort {
	public static Node<Integer> bubbleSort(Node<Integer> head )
    {
        //Write your code here
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        for(int i=0;i<count;i++){
            Node<Integer> prev=null;
            Node<Integer> curr=head;
            Node<Integer> next=head.next;
            // LinkedListNode<Integer> h=head;
            while(curr.next!=null){
                if(curr.data<next.data){
                    prev=curr;
                    curr=curr.next;
                    next=curr.next;
                }
                else{
                    if(prev==null){
                        curr.next=next.next;
                        next.next=curr;
                        prev=next;
                        next=curr.next;
                        head=prev;
                    }
                    else{
                        curr.next=next.next;
                        prev.next=next;
                        next.next=curr;
                        prev=next;
                        next=curr.next;
                    }
                }
            }
        }
        return head;
    }
}
