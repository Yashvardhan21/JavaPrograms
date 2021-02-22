package Dp1;

public class LCS {
	public static int lcs(String s, String t) {
		if(s.length()==0 || t.length()==0) {
			return 0;
		}
		
		if(s.charAt(0)==t.charAt(0)) {
			return 1+lcs(s.substring(1),t.substring(1));
		}
		else {
			int op1=lcs(s.substring(1),t);
			int op2=lcs(s,t.substring(1));
//			int op3=lcs(s.substring(1),t.substring(1));
//			int ans=Math.max(op1, Math.max(op2,op3));
			int ans = Math.max(op1,op2);
			return ans;			
		}	
	}
	
	public static int lcsM(String s, String t) {
		int m=s.length();
		int n=t.length();
		int storage[][]=new int[m+1][n+1];
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				storage[i][j]=-1;
			}
		}
		return lcsM(s,t,storage);
	}
	
	public static int lcsM(String s, String t,int storage[][]) {
		int m=s.length();
		int n=t.length();
		if(storage[m][n]!=-1) {
			return storage[m][n];
		}
		if(m==0|| n==0) {
			return 0;
		}
		if(s.charAt(0)==t.charAt(0)) {
			storage[m][n]=1+lcsM(s.substring(1),t.substring(1),storage);
		}
		else {
			int op1=lcsM(s.substring(1),t,storage);
			int op2=lcsM(s,t.substring(1),storage);
			storage[m][n]=Math.max(op1,op2);
		}
		
		return storage[m][n];
	}
	
	public static int lcsDP(String s, String t) {
		int m=s.length();
		int n=t.length();
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<m+1;i++) {
			dp[i][0]=0;
		}
		for(int i=0;i<n+1;i++) {
			dp[0][i]=0;
		}
		for(int i=1;i<m+1;i++) {
			for(int j=1;j<n+1;j++) {
				if(s.charAt(m-i)==t.charAt(n-j)) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dgeigeigeigi";
		String t="begisfnaklasnlkngeigeigeigeigeig";
		System.out.println(lcsDP(s,t));
		System.out.println(lcsM(s,t));
		System.out.println(lcs(s,t));

	}

}
