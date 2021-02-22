package temp;

import java.util.Scanner;

public class MinimumWindowSubstring {

	public static String minWindow(String s, String t) {
		if(s.length()==0 || t.length()==0){
			return "";
		}

		String res="";
		int a[]=new int[128];
		for(int i=0;i<t.length();i++){
			a[t.charAt(i)]++;
		}

		// for(char c:t.toCharArray()){
		//     ++a[c];
		// }

		int count=0;
		int left=0;
		// int right=0;
		int minLen=Integer.MAX_VALUE;
		for(int right=0;right<s.length();right++){
			if(--a[s.charAt(right)]>=0){
				count++;
			}

			while(count==t.length()){
				if(minLen>right-left+1){
					minLen=right-left+1;
					res=s.substring(left,right+1);
				}
				if(++a[s.charAt(left)]>0){
					count--;
				} 
				++left;
			}
		}
		return res;
	}


	public static void main(String args[]) {
		Scanner o=new Scanner(System.in);
		String s=o.next();
		String t=o.next();
		System.out.println(minWindow(s,t));
	}
}