package SortingAlgorithms;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,9,2,2,3,15};
		int n=arr.length;
		BubbleSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void BubbleSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
