package temp;

import java.util.HashMap;

public class ZigzagConcat {

	public static String Zigzag(String s,int n) {
		HashMap<Integer,StringBuilder> map=new HashMap<>();
		int pos=0;
		boolean down=true;
		if(s.length()==1) {
			return s;
		}

		for(int i=0;i<s.length();i++) {
			if(pos==n) {
				down=false;
			}
			if(pos==1) {
				down =true;
			}

			if(down) {
				pos++;
			}
			else {
				pos--;
			}

			if(!map.containsKey(pos)) {
				map.put(pos,new StringBuilder());
			}
			map.get(pos).append(s.charAt(i));
		}
		
		StringBuilder res=new StringBuilder();
		for(StringBuilder c:map.values()) {
			res.append(c);
		}
		return res.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="PAYPALISHIRING";
		int n=3;
		System.out.println(Zigzag(s,n));

	}

}
