package Recursion2;

import java.util.Scanner;

public class PrintKeypad {
	
	public static void printkeypad(int n) {
		printkeypad(n,"");
	}
	
	public static void printkeypad(int n,String output) {
		if(n==0) {
			System.out.println(output);
			return;
		}
		
		String a[]=helper(n%10);
		for(int i=0;i<a.length;i++) {
			printkeypad(n/10,a[i]+output);
		}
	}
	
	public static String[] helper(int n) {
		if(n<=1||n>=10) {
			System.exit(0);
		}
		else if(n==2) {
			String op[]= {"a","b","c"};
			return op;
		}
		else if(n==3) {
			String op[]= {"d","e","f"};
			return op;
		}
		else if(n==4) {
			String op[]= {"g","h","i"};
			return op;
		}
		else if(n==5) {
			String op[]= {"j","k","l"};
			return op;
		}
		else if(n==6) {
			String op[]= {"m","n","o"};
			return op;
		}
		else if(n==7) {
			String op[]= {"p","q","r","s"};
			return op;
		}
		else if(n==8) {
			String op[]= {"t","u","v"};
			return op;
		}
		else {
			String op[]= {"w","x","y","z"};
			return op;
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		printkeypad(n);

	}

}

/*Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf*/
