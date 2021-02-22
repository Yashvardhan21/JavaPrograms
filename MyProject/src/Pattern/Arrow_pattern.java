package Pattern;

import java.util.Scanner;

public class Arrow_pattern {
	public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int n1=(n+1)/2;
        int n2=n/2;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<=n2;i++){
            for(int j=1;j<=n2-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=n2-i+1;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
        
	}

}
