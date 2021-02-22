package Recursion;

import java.util.Scanner;

public class NumOfDigit {
	public static int NumDigit(int m) {
		if(m==0) {
			return 0;
		}
		return 1+NumDigit(m/10);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int m=o.nextInt();
		System.out.println(NumDigit(m));
	}

}
/*Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1*/