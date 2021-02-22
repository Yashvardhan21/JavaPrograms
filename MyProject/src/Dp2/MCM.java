package Dp2;

public class MCM {
	 public static int mcm(int[] p){
	        int n=p.length;
	        //return mcmR(p,0,n-1);
	        return mcmDp(p,0,n);
	    }
	    
	    public static int mcmDp(int[] p, int s, int e){
	    int n=p.length;
	        int m[][] = new int[n][n]; 
	  
	        int i, j, k, L, q; 
	        for (i = 1; i < n; i++) 
	            m[i][i] = 0; 
	    
	    for (L=2; L<n; L++) 
	        { 
	            for (i=1; i<n-L+1; i++) 
	            { 
	                j = i+L-1; 
	                if(j == n) continue; 
	                m[i][j] = Integer.MAX_VALUE; 
	                for (k=i; k<=j-1; k++) 
	                { 
	                    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j]; 
	                    if (q < m[i][j]) 
	                        m[i][j] = q; 
	                } 
	            } 
	        } 
	  
	        return m[1][n-1]; 
	    }

	 
	    
	    

	    // public static int mcmR(int[] p, int s, int e){
	    //     if(s==e || s==e-1){
	    //         return 0;
	    //     }
	    //     int ans=0;
	    //     for(int k=s+1;k<e;k++){
	    //         ans=Math.max(mcm(p,s,k),mcm(p,k,e))+p[s]*p[k]*p[e];
	    //     }
	    //     return ans;

}
