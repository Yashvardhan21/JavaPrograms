package Stack1;
import java.util.*;
import java.io.*; 

public class BalancedParanthesis {
//	public static boolean isBalanced(String exp) {
        // Write your code here
		static String isBalanced(String s) {
	        Stack<Character> stack=new Stack<>();
	        boolean flag=false;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
	                stack.push(s.charAt(i));
	            }
	            else{
	                try{
	                if(s.charAt(i)==')' && stack.pop()=='('){
	                    flag=true;
	                }
	                else if(s.charAt(i)=='}' && stack.pop()=='{'){
	                    flag=true;
	                }
	                else if(s.charAt(i)==']' && stack.pop()=='['){
	                    flag=true;
	                }
	                else{
	                    flag=false;
//	                    break;
	                }
	                }
	                catch(Exception e){
	                    flag=false;
	                    break;
	                }
	            }
	        }

	        if(!stack.isEmpty()){
	            flag=false;
	        }
	        
	        if(flag){
	            return "YES";
	        }
	        else{
	            return "NO";
	        }
    }
	
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        System.out.println(isBalanced("((A+B)+(A-B)"));
        
        System.out.println(isBalanced("((A+B)+(A-B))"));
	}
}
