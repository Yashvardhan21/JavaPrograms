package Recursion;

import java.util.Scanner;

public class PrintNumbers {
	public static void print(int m) {
		if(m==0) {
			return;
		}
		if(m==1) {
			System.out.println(m+" ");
		}
		print(m-1);
		System.out.println(m+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int m=o.nextInt();
		print(m);
	}

}
/*Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4*/