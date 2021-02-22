package Recursion;

import java.util.Scanner;

public class CheckNumber {
	
	public static boolean checkNum(int input[],int si,int m) {
		if(input[si]==m) {
			return true;
		}
		if(si==input.length || input[si]!=m ) {
			return false;
		}
		
		boolean smallAns=checkNum(input,si+1,m);
		return smallAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		int m=o.nextInt();
		System.out.print(checkNum(a,0,m));
		
	}

}

/*Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false*/
