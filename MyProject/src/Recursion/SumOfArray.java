package Recursion;

import java.util.Scanner;


public class SumOfArray {
	public static int sum(int input[]) {
		
		return sum(input,0);
	}
	
	public static int sum(int input[],int si) {
		int n=input.length;
		if(si==n) {
			return 0;
		}
		int smallAns=sum(input,si+1);
		return input[0]+smallAns;
	}
	
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		System.out.println(sum(a));

	}

}

/*Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7*/
