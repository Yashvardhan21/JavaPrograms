package Maths;

public class RotatedSortedArrayCount {

	public static int count(int a[]) {
		int n=a.length;
		int start=0;
		int end=n-1;
		while(start<=end) {
			int mid=(start+end)/2;
			int next=(mid+1)%n;
			int prev=(mid+n-1)%n;
			if(a[mid]<=a[prev] && a[mid]<=a[next]) {
				return mid;
			}
			else {
				if(a[start]<=a[mid] && a[mid]<=a[end]) {
					return start;
					
				}
				else if(a[start]<=a[mid]) {
					start=mid+1;
				}
				
				else if(a[mid]<=a[end]){
					end=mid-1;
				}
			}

		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,8,9,2,3,4,5,6};
//		int a[]= {1};
		System.out.println(count(a));

	}

}
