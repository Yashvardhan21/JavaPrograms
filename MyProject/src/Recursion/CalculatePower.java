package Recursion;

import java.util.Scanner;

public class CalculatePower {
	
	public static int power(int m,int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return m;
		}
		return m*power(m,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int m=o.nextInt();
		int n=o.nextInt();
		int ans=power(m, n);
		System.out.println(ans);

	}

}
/*Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32*/