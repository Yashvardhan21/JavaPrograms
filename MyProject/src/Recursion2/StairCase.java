package Recursion2;

import java.util.Scanner;

public class StairCase {
	
	public static int staircase(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		
		return staircase(n-1)+staircase(n-2)+staircase(n-3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		System.out.println(staircase(n));
	}

}

/*Sample Input 1 :
4
Sample Output 1 :
7
Sample Input 2 :
5
Sample Output 2 :
13*/