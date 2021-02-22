package Maths;
import java.util.*;

public class SortByFreq {

//	public static ArrayList<Integer> sortByFreq(int arr[]) {
//		HashMap<Integer,Integer> map=new HashMap<>();
//		for(int i=0;i<arr.length;i++) {
//			if(map.containsKey(arr[i])){
//				int freq=map.get(arr[i]);
//				freq++;
//				map.put(arr[i], freq);
//			}
//			else {
//				map.put(arr[i],1);
//			}
//		}
//		
//		int n=arr.length;
//		for(int i=0;i<n-1;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(map.get(i)<map.get(j) ||(map.get(i)==map.get(j) && arr[i]>arr[j]) ) {
//					int temp=arr[i];
//					arr[j]=arr[i];
//					arr[i]=temp;
//				}
//			}
//		}
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,3,3,3,2,4};
//		int ans[]=sortByFreq(arr);
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])){
				int freq=map.get(arr[i]);
				freq++;
				map.put(arr[i], freq);
			}
			else {
				map.put(arr[i],1);
			}
		}
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(map.get(arr[i])<map.get(arr[j]) ||(map.get(arr[i])==map.get(arr[j]) && arr[i]>arr[j]) ) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
