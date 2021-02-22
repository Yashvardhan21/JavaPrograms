package Recursion2;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static String RemoveDup(String input) {
		if(input.length()<=1) {
			return input;
		}
		String ans="";
		if(input.charAt(0)!=input.charAt(1)) {
			ans+=input.charAt(0);
		}
//		else {
//			ans+=input.charAt(0);
//		}
		String smallans=RemoveDup(input.substring(1));
		
		return ans+smallans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String input=o.nextLine();
		System.out.println(RemoveDup(input));


	}

}


/*Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz*/