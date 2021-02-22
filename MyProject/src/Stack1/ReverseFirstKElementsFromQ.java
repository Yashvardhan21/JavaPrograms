package Stack1;
import java.util.*;

public class ReverseFirstKElementsFromQ {
	public static Queue<Integer> reverseKElements(Queue<Integer> input,int k){
		Queue<Integer> q=revQ(input,k);
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        
        return q;
	}
    
    public static Queue<Integer> revQ(Queue<Integer> q, int k){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty() && k!=0){
            s.push(q.remove());
            k--;
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        return q;
    }
}


/*Sample Input 1:
5 3
1 2 3 4 5
Sample Output 1:
3 2 1 4 5
Sample Input 2:
7 7
3 4 2 5 6 7 8
Sample Output 2:
8 7 6 5 2 4 3*/