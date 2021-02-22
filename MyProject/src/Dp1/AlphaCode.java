package Dp1;
import java.util.*;
public class AlphaCode {
	 public static int CountDP(int input[],int n)
	    {
	          int m=(int)Math.pow(10,9)+7;
	    int output[]= new int[n+1];
	    output[0]=1;
	    output[1]=1;
	    for(int i=2;i<=input.length;i++ )
	    {
	        if(input[i-1]==0)
	        {
	            
	        }
	    else    
	    {output[i]+=output[i-1];}
	    if((input[i-2]*10+input[i-1]<=26)&&(input[i-2]!=0))
	    {
	    
	    }
	            
	    }
	    
	    
	    int ans=(output[n])%m;
	    
	    return ans;
	  }
	   public static void main(String[] args) {
			// Write your code here
	        Scanner sc=new Scanner(System.in);
	        String s=sc.next();
	            int n=s.length();
	        int input[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            input[i]=s.charAt(i)-'0';
	        }
	       while(input.length>=1&&input[0]!=0)
	       {
	        System.out.println(CountDP(input,n));
	       s=sc.next();
	          n=s.length();
	          input=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            input[i]=s.charAt(i)-'0';
	        }
	           
	       }

		}
}
