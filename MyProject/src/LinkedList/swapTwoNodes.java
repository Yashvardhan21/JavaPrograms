package LinkedList;

public class swapTwoNodes {
public static  Node<Integer> swap_nodes(Node<Integer> head,int i,int j){
		
        Node<Integer> p1=null;
        Node<Integer> c1=head;
        Node<Integer> c2=head;
        Node<Integer> p2=null;
        
        if(i==j){
            return head;
        }
        
        if(i>j){
            int temp=i;
            i=j;
            j=temp;
        }
        
        int count1=0;
        while(c1!=null){
            if(count1==i){
                break;
            }
            p1=c1;
            count1++;
            c1=c1.next;
            
        }
        
        int count2=0;
         while(c2!=null){
            
            if(count2==j){
                break;
            }
            p2=c2;
            count2++;
            c2=c2.next;
            
        }
        
        if((i==0 || j==0) && Math.abs(i-j)==1){
            c1.next=c2.next;
            c2.next=c1;
            return c2;
        }
        
        else if(i==0 || j==0){
            Node<Integer> n1=null;
            n1=c1.next;
            c1.next=c2.next;
            c2.next=n1;
            p2.next=c1;
            return c2;
        }
        
        else if(Math.abs(i-j)==1){
            
         	c1.next=c2.next;
            c2.next=c1;
            p1.next=c2;
            return head;
        }
        else{
            Node<Integer> n1=null;
            n1=c1.next;
            c1.next=c2.next;
            p1.next=c2;
            p2.next=c1;
            c2.next=n1;
            return head;
        }
        
        
	}
}
