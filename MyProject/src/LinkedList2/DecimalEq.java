package LinkedList2;

public class DecimalEq {
	public static int decimal(Node<Integer> head) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
    	
        Node<Integer> temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        int ans=0;
        while(head!=null){
            if(count-1>=0){
            	ans+=Math.pow(2,count-1)*head.data;
            }
            count--;
            head=head.next;
        }
        return ans;
        
    }
}


/*Sample Input 1:
1 0 -1
Sample Output 1:
2
Sample Input 2:
1 0 1 -1
Sample Output 2:
5*/