package Recursion;

import java.util.Scanner;

public class FirstIndex {

	public static int FirstInd(int[] input, int si, int n) {
		if(si==input.length) {
			return -1;
		}
		
		if(input[si]==n) {
			return si;
		}
		
		int smallAns=FirstInd(input,si+1,n);
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
		System.out.print(FirstInd(a,0,m));

	}

}


/*Sample Input :
4
9 8 10 8
8
Sample Output :
1*/