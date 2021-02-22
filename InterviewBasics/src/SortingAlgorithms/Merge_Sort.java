package SortingAlgorithms;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,9,2,2,3,15};
		int n=arr.length;
		MergeSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void MergeSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		MergeSort(arr,0,n-1);
	}

	private static void MergeSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start>=end) {
			return;
		}
		int mid=start+(end-start)/2;
		MergeSort(arr,start,mid);
		MergeSort(arr,mid+1,end);
		merge(arr,start,end);
	}

	private static void merge(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int mid=start+(end-start)/2;
		int n=arr.length;
		int a[]=new int[n];
		int i=start;
		int j=mid+1;
		int k=0;
		
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				a[k++]=arr[i];
				i++;
			}
			else {
				a[k++]=arr[j];
				j++;
			}
		}
		
		if(i<=mid) {
			a[k++]=arr[i];
		}
		
		if(j<=end) {
			a[k++]=arr[j];
		}
		
		k=0;
		for(int l=start;l<=end;l++) {
			arr[l]=a[k++];
		}
			
	}

}
