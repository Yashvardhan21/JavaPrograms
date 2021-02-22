package LinkedList;

public class DeleteEveryNnode {
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        Node<Integer> temp=head;
        Node<Integer> head1=temp;
        Node<Integer> prev=null; 
        
        if(head==null || head.next==null || M==0){
            return null;
        }
        // if()
        
        int i=0;
        while(temp!=null){
            int j=M;
            // head1=temp;
            while(j>0 && temp!=null){
                j--;
                prev=temp;
                temp=temp.next;
            }
            
            int k=N;
            while(k>0 && temp!=null){
                k--;
                temp=temp.next;
            }
            prev.next=temp;
        }
        return head1;
	}
}


/*Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
2 2
Sample Output 1 :
1 2 5 6
Sample Input 2 :
2
10 20 30 40 50 60 -1
0 1
1 2 3 4 5 6 7 8 -1
2 3
Sample Output 2 :
1 2 6 7*/