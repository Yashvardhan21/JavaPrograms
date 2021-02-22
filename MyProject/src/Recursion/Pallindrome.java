package Recursion;

import java.util.Scanner;

public class Pallindrome {
	
	public static boolean isPallindrome(String s) {
		return isPallindrome(s,0,s.length()-1);
	}
	
	public static boolean isPallindrome(String s,int si,int ei) {
		if(si>=ei) {
			return true;
		}
		if(s.charAt(si)==s.charAt(ei)) {
			boolean smallAns=isPallindrome(s,si+1,ei-1);
			if(smallAns) {
				return true;
			}
		}
		return false;
		
	
		
	}
	
	
	public static void main(String args[]) {
		Scanner o=new Scanner(System.in);
		String s=o.nextLine();
		System.out.println(isPallindrome(s));
	}

}


/*Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false*/