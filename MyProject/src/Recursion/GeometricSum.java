package Recursion;

import java.util.Scanner;

public class GeometricSum {

	public static double Gsum(int k) {
		return Gsum(k,1);
	}

	public static double Gsum(int k,double a) {
		if(k==0) {
			return 1;
		}
		a=a*2;
		return 1/a+Gsum(k-1,a);


	}

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		int k=o.nextInt();
		System.out.println(Gsum(k));
	}

}

/*Sample Input 1 :
3
Sample Output 1 :
1.875
Sample Input 2 :
4
Sample Output 2 :
1.93750*/

