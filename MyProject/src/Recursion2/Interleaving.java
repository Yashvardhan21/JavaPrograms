package Recursion2;

public class Interleaving {

	public static void interleavings(String first, String second){

		// Write your code here
		interleavings(first,second,"");
	}
    
    public static void interleavings(String s1, String s2,String s3){
        if(s1.length()==0 && s2.length()==0){
            System.out.println(s3);
            return;
        }
        if(s1.length()>=1)
        interleavings(s1.substring(1),s2,s3+s1.charAt(0));
        if(s2.length()>=1)
        interleavings(s1,s2.substring(1),s3+s2.charAt(0));
    }

}

/*Sample Input :
abc
def
Sample Output :
abcdef
abdcef
abdecf
abdefc
adbcef
adbecf
adbefc
adebcf
adebfc
adefbc
dabcef
dabecf
dabefc
daebcf
daebfc
daefbc
deabcf
deabfc
deafbc
defabc*/