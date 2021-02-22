package LinkedList;

public class EvenAfterOdd {
public static Node<Integer> sortEvenOdd(Node<Integer> head) {
        
       	Node<Integer> evenH=null;
        Node<Integer> evenT=null;
        Node<Integer> oddH=null;
        Node<Integer> oddT=null;
        
        while(head!=null){
            Node<Integer> newNode=new Node<Integer>(head.data);
            if(head.data%2==0){
                if(evenH==null){
                    evenH=newNode;
                    evenT=newNode;
                }
                else{
                    evenT.next=newNode;
                    evenT=evenT.next;
                }
            }
            else{
                if(oddH==null){
                    oddH=newNode;
                    oddT=newNode;
                }
                else{
                    oddT.next=newNode;
                    oddT=oddT.next;
                }
            }
            
            head=head.next;
        }
        
        if(oddH==null){
            return evenH;
        }
        else if(evenH==null){
            return oddH;
        }
        else{
        evenT.next=null;
        oddT.next=null;
        oddT.next=evenH;
        return oddH;
        }

	}
}
