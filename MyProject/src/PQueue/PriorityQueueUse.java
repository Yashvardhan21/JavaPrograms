package PQueue;
import java.util.*;

class MaxPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2) {
			return 1;
		}
		else if(o1>o2) {
			return -1;
		}
		
		return 0;
	}
	
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length()) {
			return -1;
		}
		else if(o1.length()>o2.length()) {
			return 1;
		}
		return 0;
	}

	
}


public class PriorityQueueUse {
	
	public static void sortKSorted(int arr[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++) {
			pq.add(arr[i]);
		}
		
		for(;i<arr.length;i++) {
			arr[i-k]=pq.remove();
			pq.add(arr[i]);
		}
		
		for(int j=arr.length-k;j<arr.length;j++) {
			arr[j]=pq.remove();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MaxPQComparator maxcomparator=new MaxPQComparator();
//		PriorityQueue<Integer> PQ = new PriorityQueue<>(maxcomparator);
		//PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
//		int arr[]= {2,4,1,9,6,8};
//		for(int i=0;i<arr.length;i++) {
//		//	System.out.println(arr[i]+" ");
//			PQ.add(arr[i]);
//		}
//		//sortKSorted(arr,3);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(PQ.remove()+" ");
//		}
		String arr[]= {"at","this","their","a","the"};
		StringLengthComparator lcomp = new StringLengthComparator();
		PriorityQueue<String> PQ = new PriorityQueue<>(lcomp);
		for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]+" ");
				PQ.add(arr[i]);
			}
		for(int i=0;i<arr.length;i++) {
			System.out.print(PQ.remove()+" ");
		}

	}

}
