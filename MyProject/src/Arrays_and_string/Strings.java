package Arrays_and_string;

public class Strings {
	
	//count words
	
	public static int countWords(String str){
		     
        String a[]=str.split(" ");
        int n1=a.length;
        return n1;

	}
	
	//check pallindrome
	
	public static boolean checkPalindrome(String str){
	   int n=str.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        
        
        if(str.equals(rev))
            return true;
        else
            return false;
	}

	//print all substring
	
	public static void printSubstrings(String str){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question.
		*/
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++)
                System.out.println(str.substring(i,j));
        }

	}
	
	//reverse string word wise
	
	public static String reverseWordWise(String input) {
		// Write your code here
        String a[]=input.split(" ");
        String res="";
        for(int i=a.length-1;i>=0;i--){
            res+=a[i]+" ";
        }
        return res.substring(0,res.length()-1);

	}
	
	
	
	
}
