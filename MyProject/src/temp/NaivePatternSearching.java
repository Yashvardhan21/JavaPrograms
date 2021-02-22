package temp;
import java.util.*;


public class NaivePatternSearching {
	
	public static void findPattern(String s,String t) {
		int n=s.length();
		int m=t.length();
		int count=0;
		for(int i=0;i<n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				if(s.charAt(i+j)!=t.charAt(j)) {
					break;
				}
			}
			
			if(j==m) {
//				System.out.println("Pattern found at index : "+i);
				count++;
				
			}
		}
		System.out.println(count);
//		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner o=new Scanner(System.in);
//		String s=o.next();
//		String t=o.next();
		String s = "AABAACAADAABAAABAA"; 
        String t = "AABA";
//		System.out.println("Pattern found at index : "+findPattern(s,t));
        findPattern(s,t);

	}

}
