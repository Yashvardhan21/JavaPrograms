package temp;

import java.util.HashSet;

public class substringRecursive {
	
	static HashSet<String > set=new HashSet<>();

	private static void findSubstring(String s) {
		// TODO Auto-generated method stub
		if(s.length()==1) {
			//System.out.println(s);
			set.add(s);
			return;
		}
		else {
			//System.out.println(s);
			set.add(s);
			findSubstring(s.substring(0,s.length()-1));
			findSubstring(s.substring(1));
			
		}
		
	}
	public static void main(String[] args) {
		String s="xyz";
		findSubstring(s);
		for(String i:set) {
			System.out.println(i);
		}

	}

	

}
