package temp;

import java.util.HashMap;
import java.util.Scanner;

public class PathThroughGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int x1=o.nextInt();
		int y1=o.nextInt();
		if(x1<y1) {
			swap(x1,y1);
		}
		
		if(x1==y1) {
			System.out.print(0);
			return;
		}
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		int c=0;
		while(x1!=1) {
			c++;
			x1=get1(x1);
			map.put(x1,c);
		}
		c=0;
		while(!map.containsKey(y1)) {
			c++;
			y1=get1(y1);
		}
		System.out.print(c+map.get(y1));

	}
	
	
	private static void swap(int x1, int y1) {
		// TODO Auto-generated method stub
		int temp=x1;
		x1=y1;
		y1=temp;
	}


	public static int get1(int num) {
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return num/i;
			}
		}
		return 1;
	}

}
