package Pattern;

import java.util.Scanner;

public class Triangle_of_numbers {

public static void main(String[] args) {
		
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int c=1;
        
        for(int i=1;i<=n;i++){
            c=i;
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
                
            }
            
            for(int k=1;k<=i;k++){
                System.out.print(c);
                c++;
            }
            
            c=2*i-2;
           for(int l=1;l<=(i-1);l++){
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
    }

}

/*
 Sample Input 2:
4
Sample Output 2:
        1
       232
      34543
     4567654
  */
