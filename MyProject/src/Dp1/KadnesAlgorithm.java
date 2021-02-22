package Dp1;
import java.util.*;

public class KadnesAlgorithm {
	public static int MaxSum_SubArray(int a[]) {
		int meh=0;
		int msf=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			meh=meh+a[i];
			if(meh<a[i]) {
				meh=a[i];
			}
			if(msf<meh) {
				msf=meh;
			}
		}
		return msf;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(MaxSum_SubArray(a));

	}

}
