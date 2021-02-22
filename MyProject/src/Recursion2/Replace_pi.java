package Recursion2;

import java.util.Scanner;

public class Replace_pi {
	public static String replacepi(String input) {
		if(input.length()==1) {
			return input;
		}
		String ans="";
		String smallans=replacepi(input.substring(1));
		if(input.charAt(0)=='p' && input.charAt(1)=='i') {
			ans="3.14"+smallans.substring(1);
			return ans;
		}
		else {
			return ans=input.charAt(0)+smallans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String str=o.next();
		System.out.println(replacepi(str));
	}

}


/*Sample Input 1 :
xpix
Sample Output :
x3.14x
Sample Input 2 :
pipi
Sample Output :
3.143.14
Sample Input 3 :
pip
Sample Output :
3.14p*/