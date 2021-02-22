package Maths;

public class BinarySearch {

	public static void binarySearch(int arr[],int data) {
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		while(start<=end) {
			if(data>arr[mid]) {
				start=mid+1;
			}
			else if(data==arr[mid]) {
				System.out.println(data+" "+mid);
				break;			}
			else {
				end=mid-1;
			}
			mid=(start+end)/2;
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		binarySearch(arr,4);

	}

}
