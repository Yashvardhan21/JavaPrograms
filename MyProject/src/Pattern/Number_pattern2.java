package Pattern;

import java.util.Scanner;

public class Number_pattern2 {
	public static void main(String[] args) {
		// Write your code here
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        for(int i=1;i<=n;i++){
            int c=i;
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // System.out.println();
            
            for(int k=1;k<(2*n-2*i);k++){
                System.out.print(" ");
            }
            
            for(int l=1;l<=i;l++){
                System.out.print(c);
                c--;
            }
            System.out.println();            
        }
       
	}
}

/*
 Sample Input 1 :
4
Sample Output 1 :
1      1
12    21
123  321
12344321
  /
 */

