package LinkedList;

public class UnionOfLL {
	public static Node<Integer> Union(Node<Integer> head1, Node<Integer> head2) {
		// Write your code here
        
		Node<Integer> temp1=head1;
        Node<Integer> list1=new Node<Integer> (temp1.data);
        Node<Integer> finalList=list1;
        while(temp1.next!=null){
            temp1=temp1.next;
            list1.next=new Node<Integer> (temp1.data);
            list1=list1.next;
        }
        Node<Integer> temp2=head2;
        while(temp2!=null){
            if(present(head1,temp2.data)){
                temp2=temp2.next;
                continue;
            }
            else{
                Node<Integer> newNode=new Node<Integer>(temp2.data);
                list1.next=newNode;
                newNode.next=null;
                list1=list1.next;
                temp2=temp2.next;
            }
            
        }
        return finalList;
		
	}
    
    public static boolean present(Node<Integer> head, int data){
        Node<Integer> temp=head;
        boolean flag=false;
        while(temp!=null){
            if(temp.data==data){
                temp.data=-1;
                flag=true;
                break;
            }
            temp=temp.next;
        }
        return flag;
    }
}

/*Sample Input 1 :
1 2 3 4 -1
8 7 5 3 -1
Sample Output 1 :
1
2
3
4
8
7
5
Sample Input 2 :
1 2 1 1 -1
8 -1
Sample Output 2 :
1
2
1
1
8*/