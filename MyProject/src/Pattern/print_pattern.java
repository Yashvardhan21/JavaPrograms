package Pattern;

public class print_pattern {

	public static void printPattern(int n){

		// Write your code here
        int c=1;
        for(int i=1;i<=(n+1)/2;i++){
            for(int j=1;j<=n;j++){
                System.out.print(c+" ");
                c++;
            }
            c=c+n;
            System.out.println();
        }
        if(n%2==0)
            c=c-n;
        else
            c=c-3*n;
        for(int i=(n+1)/2;i<n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(c+" ");
                c++;
            }
            c=c-3*n;
            System.out.println();
        }

	}
}


/*N = 5
 1    2   3    4   5
 11   12  13   14  15
 21   22  23   24  25
 16   17  18   19  20
 6    7    8   9   10*/