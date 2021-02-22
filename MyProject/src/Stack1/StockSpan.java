package Stack1;

import java.util.Stack;

public class StockSpan {
	 public static int[] stockSpan(int[] price) {
	        // Write your code here
	        int n=price.length;
	        Stack<Integer> s=new Stack<>();
	        int ans[]=new int[n];
	        for(int i=0;i<n;i++){
	            int temp=price[i];
	            if(s.isEmpty()){
	                s.push(i);
	                ans[i]=i+1;
	            }
	            else{
	                while(!s.isEmpty() && price[s.peek()]<temp){
	                    s.pop();

	                }

	                if(s.isEmpty()){
	                    s.push(i);
	                    ans[i]=i+1;
	                }

	                else{                    
	                    ans[i]=i-s.peek();
	                    s.push(i);
	                }
	            }
	        }
	        return ans;

	    }

}

/*Sample Input 1:
4
10 10 10 10
Sample Output 1:
1 1 1 1 
Sample Input 2:
8
60 70 80 100 90 75 80 120
Sample Output 2:
1 2 3 4 1 1 2 8 */
