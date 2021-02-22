package Recursion2;

import java.util.Scanner;

public class QuickSort {
	public static void quickSort(int[] input) {
        quickSort(input,0,input.length-1);
    }

    public static void quickSort(int[] input,int si,int ei) {
        if(si>=ei){
            return;
        }

        int p_pos=partition(input,si,ei);
        quickSort(input,si,p_pos-1);
        quickSort(input,p_pos+1,ei);

    }

    public static int partition(int[] input, int si , int ei){
        int count=0;
        for(int i=si+1;i<=ei;i++){
            if(input[si]>input[i]){
                count++;
            }
        }

        int p_pos=count+si;
        int temp=input[p_pos];
        input[p_pos]=input[si];
        input[si]=temp;
        int i=si;
        int j=ei;
        while(i<p_pos && j>p_pos){
            if(input[i]<input[p_pos]){
                i++;
            }
            else{
                if(input[j]<input[p_pos]){
                    int temp1=input[i];
                    input[i]=input[j];
                    input[j]=temp1;
                    j--;
                    i++;
                }
                else{
                    j--;
                    if(input[j]<input[p_pos]){
                        int temp2=input[i];
                        input[i]=input[j];
                        input[j]=temp2;
                        j--;
                        i++;
                    }
                }
            }

        }
        
        return p_pos;


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		quickSort(a);
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
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 */