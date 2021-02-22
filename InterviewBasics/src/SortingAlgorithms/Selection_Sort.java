package SortingAlgorithms;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,9,2,3,15};
		int n=arr.length;
		SelectionSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void SelectionSort(int[] arr,int n) {
		// TODO Auto-generated method stub
		int min=0;
		for(int i=0;i<n-1;i++) {
			min=i;
			for(int j=i;j<n;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			
			if(min!=i) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		
	}

}
