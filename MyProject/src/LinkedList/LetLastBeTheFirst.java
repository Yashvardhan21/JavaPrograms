package LinkedList;

public class LetLastBeTheFirst {
	public static Node<Integer> lastToFront(Node<Integer> head) {
		// Write your code here
        Node<Integer> head1=head;
        Node<Integer> last1=head;
        Node<Integer> prev=null;
        while(last1.next!=null){
            prev=last1;
            last1=last1.next;
        }
        last1.next=head1;
        head=last1;
        prev.next=null;
        return head;

	}
}
