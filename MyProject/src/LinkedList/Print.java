package LinkedList;

public class Print {

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
}
