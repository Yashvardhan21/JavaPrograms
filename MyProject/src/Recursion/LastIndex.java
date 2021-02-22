package Recursion;

import java.util.Scanner;

public class LastIndex {
	public static int LastInd(int[] input, int ei, int n) {
		if(ei<0) {
			return -1;
		}
		
		if(input[ei]==n) {
			return ei;
		}
		
		int smallAns=LastInd(input,ei-1,n);
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
		System.out.print(LastInd(a,a.length-1,m));

	}

}

/*Sample Input :
4
9 8 10 8
8
Sample Output :
3*/
