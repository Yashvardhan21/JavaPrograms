package SortingAlgorithms;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,9,2,3,15};
		int n=arr.length;
		InsertionSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void InsertionSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}

}
