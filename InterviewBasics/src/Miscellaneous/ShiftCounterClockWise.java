package Miscellaneous;

public class ShiftCounterClockWise {
	public static void main(String[] args) {
        String s="ABCD";
        int k=2;
        counterClock(s,k);
        // System.out.println((char)(65+'Z'-'A'));
	}
	
	public static void counterClock(String s, int k){
	    String ans="";
	    for(int i=0;i<s.length();i++){
	        ans+=(char)(65+((s.charAt(i)-'A'+26-k)%26));
	    }
	    System.out.println(ans);  
	}
}
