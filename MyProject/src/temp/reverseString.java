package temp;

public class reverseString {
	
	public static String reverse(String s) {
		if(s.length()<=1) {
			return s;
		}
		String ans="";
		ans+=s.charAt(s.length()-1);
		
		return ans+reverse(s.substring(0,s.length()-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverse("abcde"));

	}

}
