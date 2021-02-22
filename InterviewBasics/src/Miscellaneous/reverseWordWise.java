package Miscellaneous;

public class reverseWordWise {
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        System.out.println(reverseWordWise("My name is Yash"));
	}
	
	public static String reverseWordWise(String s){
	   // String a[]=s.split(" ");
	   // String ans="";
	   // for(int i=a.length-1;i>=0;i--){
	   //     ans+=a[i]+" ";
	   // }
	   // return ans;
	   
	   String ans="";
	   int end=s.length();
	   int i=0;
	   for(i=s.length()-1;i>=0;i--){
	       if(s.charAt(i)==' '){
	           ans+=s.substring(i+1,end)+" ";
	           end=i;
	       }
	   }
	   ans+=s.substring(i+1,end);
	   return ans;
	}
}
