package Stack1;

import java.util.Stack;

public class InfixToPostFix {
	 public static int priority(Character ch){
	        if(ch=='^'){
	            return 3;
	        }
	        else if(ch=='*' || ch=='/'){
	            return 2;
	        }
	        else if(ch=='+' || ch=='-'){
	            return 1;
	        }
	        return -1;
	    }
	    
		public static void evaluatePostfix(String input){       
	        Stack<Character> s=new Stack<>();
	        int n=input.length();
	        String exp="";
	        for(int i=0;i<n;i++){
	            char ch=input.charAt(i);
	            if(Character.isLetterOrDigit(ch)){
	                exp+=ch;
	            }
	            else{
	            	if(ch=='('){
	                    s.push(ch);
	                }
	                else if(ch==')'){
	                    while(!s.isEmpty() && s.peek()!='('){
	                        exp+=s.pop();
	                    }
	                    if(s.peek()=='('){
	                    	s.pop();
	                    }
	                }
	                
	                else {
	                    while(!s.isEmpty() && priority(ch)<=priority(s.peek())){
	                    	exp+=s.pop();
	                    }
	                    s.push(ch);
	                }
	                
	            }
	        }
	        
	        while(!s.isEmpty()){
	            if(s.peek()=='('){
	                s.pop();
	            }
	            else{
	                exp+=s.pop();
	            }
	        }
	        
	        System.out.println(exp);
	        
	        System.out.println(EvalPostfix(exp));

		}
	    
	    public static int EvalPostfix(String input){
	        Stack<Integer> s=new Stack<>();
	        int n = input.length();
	        for(int i=0;i<n;i++){
	            char ch=input.charAt(i);
	            if(Character.isDigit(ch)){
	                s.push(ch-'0');
	            }
	            else{
	                int a=0;
	                int b=0;
	                if(!s.isEmpty()){
	                    a=s.pop();
	                    b=s.pop();
	                }
	                if(ch=='+'){
	                    int ans= a+b;
	                    s.push(ans);
	                }
	                else if(ch=='-'){
	                    int ans= b-a;
	                    s.push(ans);
	                }
	                else if(ch=='*'){
	                    int ans= a*b;
	                    s.push(ans);
	                }
	                else if(ch=='/'){
	                    int ans= b/a;
	                    s.push(ans);
	                }
	            }
	        }
	        return s.pop();
	        
	    }

}

/*Sample Input 1 :
3+4
Sample Output 1 :
34+
7*/
