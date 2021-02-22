package Recursion;

import java.util.Scanner;

public class CountZeros {

	public static int CountZero(int n) {
		if(n<10) {
			if(n==0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		int l_d=n%10;
		int ans=CountZero(n/10);
		if(l_d==0) {
			return 1+ans;
		}
		else {
			return ans;
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		System.out.println(CountZero(n));
	}

}

/*Sample Input 1 :
10204
Sample Output 1 :
2
Sample Input 2 :
708000
Sample Output 2 :
4
*/