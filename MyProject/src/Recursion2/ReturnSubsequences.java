package Recursion2;

public class ReturnSubsequences {
	private static String[] subsequence(String s) {
		if(s.length()==0) {
			String ans[]= {""};
			return ans;
		}
		
		String smallAns[]=subsequence(s.substring(1));
		String ans[]=new String[2*smallAns.length];
		
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			ans[k++]=smallAns[i];
		}
		
		for(int i=0;i<smallAns.length;i++) {
			ans[k++]=s.charAt(0)+smallAns[i];
		}
		return ans;
	}
	
	private static void printSubsequence(String s) {
//		if(s.length()==0) {
//			System.out.println(s);
//			return;
//		}
		
		printSubsequence(s,"");
		
	}

	private static void printSubsequence(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		printSubsequence(s.substring(1),ans);
		printSubsequence(s.substring(1),ans+s.charAt(0));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans[]=subsequence("xyz");
//		for(int i=0;i<ans.length;i++) {
//			System.out.println(ans[i]);
//		}
				
		printSubsequence("abcd");

	}


}
