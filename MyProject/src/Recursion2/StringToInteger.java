package Recursion2;

import java.util.Scanner;
import java.lang.*;

public class StringToInteger {
	
	public static int stringToInt(String input) {
		int n=input.length();
		int b=input.charAt(0);
		if(n==1) {
			return b-'0';
		}
		int c=b-'0';
		int ans=stringToInt(input.substring(1));
		int x=(int)Math.pow(10, n-1);
		return c*x+ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String str=o.next();
		System.out.println(stringToInt(str));
	}

}

/*Sample Input 1 :
1231
Sample Output 1 :
1231
Sample Input 2 :
12567
Sample Output 2 :
12567*/
