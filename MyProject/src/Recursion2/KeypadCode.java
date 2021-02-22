package Recursion2;

import java.util.Scanner;

public class KeypadCode {
	
	public static String[] keypad(int n) {
		if(n==0) {
			String ans[]= {""};
			return ans;
		}
		String a[]=helper(n%10);
		String smallans[]=keypad(n/10);
		String ans[]=new String[smallans.length*a.length];
		int k=0;
		for(int i=0;i<smallans.length;i++) {
			for(int j=0;j<a.length;j++) {
				ans[k++]=smallans[i]+a[j];
			}
		}
		return ans;
		
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
		String ans[]=keypad(n);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
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
