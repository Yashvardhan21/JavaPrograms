package Stack1;

import java.util.Stack;

public class SortAStack {
public static void sortStack(Stack<Integer> stack){
		
		// Write your code here		
        
        Stack<Integer> s=new Stack<>();
        while(!stack.isEmpty()){
            int num=stack.pop();
            if(s.isEmpty()){
                s.push(num);
            }
            else{
                while(!s.isEmpty() && s.peek()>num){
                    stack.push(s.pop());
                }
            
                s.push(num);
                
                
            }
            
        }
        
        
        while(!s.isEmpty()){
            stack.push(s.pop());
        }
        
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

	}
}

/*Sample Input
5
1 2 3 4 5
Sample Output
1 2 3 4 5*/
