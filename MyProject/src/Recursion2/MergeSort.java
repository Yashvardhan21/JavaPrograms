package Recursion2;

import java.util.Scanner;

public class MergeSort {	
	public static void mergesort(int[] input) {
		mergesort(input,0,input.length-1);
	}

	public static void mergesort(int[] input,int start,int end) {
		if(start>=end) {
			return;
		}
		int mid=(start+end)/2;
		mergesort(input,start,mid);
		mergesort(input,mid+1,end);
		merge(input,start,end);
	}
	
	public static void merge(int[] input, int start,int end) {
		int mid=(start+end)/2;
		int n=input.length;
		int ans[]=new int[n];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end) {
			if(input[i]>input[j]) {
				ans[k++]=input[j];
				j++;
			}
			else {
				ans[k++]=input[i];
				i++;
			}
			
		}
		
		while(i<=mid) {
			ans[k++]=input[i];
			i++;
		}
		
		while(j<=end) {
			ans[k++]=input[j];
			j++;
		}
		
		k=0;
		for(int l=start;l<=end;l++) {
			input[l]=ans[k++];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		mergesort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}

/*Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5*/