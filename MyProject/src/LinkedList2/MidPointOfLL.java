package LinkedList2;

public class MidPointOfLL {
	public static int printMiddel(Node<Integer> head) {
        int length=0;
        Node<Integer> temp1=head;
        Node<Integer> temp2=head;
        while(temp1!=null){
            length++;
            temp1=temp1.next;
        }
        
        int mid=(length-1)/2;
        int i=0;
        while(i!=mid){
            temp2=temp2.next;
            i++;
        }
        return temp2.data;
    }
}
