package Recursion2;

import java.util.*;

public class ReplaceCharacters {

	public static String ReplaceChar(String input,char c1,char c2) {
		if(input.length()==0) {
			return input;
		}
		String ans="";
		if(input.charAt(0)==c1) {
			ans+=c2;
		}
		else {
			ans+=input.charAt(0);
		}
		String smallans=ReplaceChar(input.substring(1),c1,c2);
		
		return ans+smallans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String input=o.nextLine();
		char c1=o.next().charAt(0);
		char c2=o.next().charAt(0);
		System.out.println(ReplaceChar(input,c1,c2));

	}

}

/*Sample Input :
abacd
a x
Sample Output :
xbxcd*/
