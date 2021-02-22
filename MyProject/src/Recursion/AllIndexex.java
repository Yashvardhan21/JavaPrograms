package Recursion;

import java.util.Scanner;

public class AllIndexex {
	
	public static int[] AllInd(int[] input, int si, int n) {
		if(si==input.length) {
			int a[]=new int[0];
			return a;
		}
		int smallAns[]=AllInd(input,si+1,n);
		if(input[si]!=n) {
			return smallAns;
			}
		else {
			int ans[]=new int[smallAns.length+1];
			ans[0]=si;
			for(int i=1;i<=smallAns.length;i++) {
				ans[i]=smallAns[i-1];
				}
				return ans;
				
			}
		}
		

		
		

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		int m=o.nextInt();
		int ans[]=AllInd(a,0,m);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		

	}

}

/*Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4*/
