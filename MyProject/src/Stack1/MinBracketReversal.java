package Stack1;

import java.util.Stack;

public class MinBracketReversal {
public static int countBracketReversals(String input){
		
		// Write your code here
		Stack<Character> s=new Stack<>();
        if((input.length()%2)!=0){
            return -1;
        }
        
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='{'){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    s.push(ch);
                }
                else if(!s.isEmpty() && s.peek()=='{'){
                    s.pop();
                }
                else if(!s.isEmpty() && s.peek()=='}'){
                    s.push(ch);
                }
                
            }            
        }
        
        int count=0;
        while(!s.isEmpty() && s.size()>=2){
            char a=s.pop();
            char b=s.pop();
            if(a==b){
                count=count+1;
            }
            else{
                count=count+2;
            }
            
        }
        return count;
        
	}
}

/*Sample Input 1:
{{{
Sample Output 1:
-1
Sample Input 2:
{{{{}}
Sample Output 2:
1*/
