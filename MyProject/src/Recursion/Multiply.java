package Recursion;
import java.util.*;

public class Multiply{
	public static int MultiplyTwo(int m,int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return m;
		}
		return m+MultiplyTwo(m,n-1);
	}
	


public static void main(String args[]) {
	Scanner o=new Scanner(System.in);
	int m=o.nextInt();
	int n=o.nextInt();
	int ans=MultiplyTwo(m, n);
	System.out.println(ans);
	
}

}

/*Sample Input 1 :
3 
5
Sample Output 1 :
15
Sample Input 2 :
4 
0
Sample Output 2 :
0*/