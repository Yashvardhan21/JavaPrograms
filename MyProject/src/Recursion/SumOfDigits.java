package Recursion;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int SumDigit(int n) {
		if(n==0) {
			return 0;
		}
		int l_d=n%10;
		int smallAns=SumDigit(n/10);
		return l_d+smallAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner o=new Scanner(System.in);
		int m=o.nextInt();
		System.out.println(SumDigit(m));

	}

}

/*Sample Input 1 :
12345
Sample Output 1 :
15
Sample Input 2 :
9
Sample Output 2 :
9*/
