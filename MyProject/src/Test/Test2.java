package Test;

public class Test2 {
	//String of length K
	public static String[] allStrings(String charSet, int len){
		
		// Write your code here 
        if(len==0){
            String a[]={""};
            return a;
        }
        int k=0;
    	String smallAns[]=allStrings(charSet,len-1);
        String ans[]=new String[charSet.length()*smallAns.length];
        for(int i=0;i<charSet.length();i++){
            for(int j=0;j<smallAns.length;j++){
                ans[k++]=charSet.charAt(i)+smallAns[j];
            }
        }
        return ans;

	}
	
	//gENERATE ALL PARANTHESIS
public static void printWellFormedParanthesis( int n){
		
		// Write your code here
        printWellFormedParanthesis(n,n,"");

	}
	
    public static void printWellFormedParanthesis(int op, int cp,String ans){
        if(op==0 && cp==0){
            System.out.println(ans);
            return;
        }
        
        if(op>cp){
            return;
        }
        
        if(op>0){
            printWellFormedParanthesis(op-1,cp,ans+"(");
        }
        
        if(cp>0){
            printWellFormedParanthesis(op,cp-1,ans+")");
        }
    }
    
    //print Increasing number
    public static void printIncreasingNumber(int n) {
		/* Your class should be named Solution.
		 * Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
        printIncreasingNumber(n,"",1);
        

	}
    
    public static void printIncreasingNumber(int n , String ans, int start){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        
        for(int i=start;i<=9;i++){
            printIncreasingNumber(n-1,ans+i,i+1);
        }
    }

}
