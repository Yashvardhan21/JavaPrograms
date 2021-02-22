package SortingAlgorithms;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,87,2,2,3,15};
		int n=arr.length;
		quickSort(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void quickSort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>=ei) {
			return;
		}
		
		int p_pos=partition(arr,si,ei);
		quickSort(arr,si,p_pos-1);
		quickSort(arr,p_pos+1,ei);
	}

	private static int partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=si+1;i<=ei;i++) {
			if(arr[i]<arr[si]) {
				count++;
			}
		}
		
		int p_pos=si+count;
		int t=arr[p_pos];
		arr[p_pos]=arr[si];
		arr[si]=t;
		int i=si;
		int j=ei;
		while(i<p_pos && j>p_pos) {
			if(arr[i]<arr[p_pos]) {
				i++;
			}
			else {
				if(arr[j]<arr[p_pos]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					j--;
					i++;
				}
				else {
					j--;
				}
			}
		}
		
		return p_pos;
	}

}
