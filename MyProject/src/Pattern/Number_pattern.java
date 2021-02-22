package Pattern;

import java.util.Scanner;

public class Number_pattern {

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
        
        System.out.println();
        }
  
	}
}



/*Sample Input :
5
Sample Output :
          1
        23
      345
    4567
  56789*/