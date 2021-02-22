package Recursion2;

public class minimum_count {

	public static int minCount(int n){
		/* Your class should be named Solution
	 	 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		*/
        
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        double num=Math.sqrt(n);
        int ans=0;
        for(int i=1;i<=num;i++){
            ans=minCount(n-i*i);
        }
        return ans+1;
		
	}
}

/*Sample Input 1 :
12
Sample Output 1 :
3
Sample Output 1 Explanation :
12 can be represented as :
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 2^2
1^1 + 1^1 + 1^1 + 1^1 + 2^2 + 2^2
2^2 + 2^2 + 2^2
As we can see, the output should be 3.
Sample Input 2 :
9
Sample Output 2 :
1*/

