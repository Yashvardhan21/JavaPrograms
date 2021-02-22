package Arrays_and_string;

import java.util.Scanner;

public class Array2D {

	//row wise sum
	public static void main(String[] args) {

		Scanner o=new Scanner(System.in);
		int m=o.nextInt();
		int n=o.nextInt();
		int sum=0;
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=o.nextInt();
				sum+=a[i][j];
			}
			System.out.print(sum+" ");
			sum=0;
		}



	}

	//largest row or column

	public static void findLargest(int input[][]){

		int m=input.length;
		int n=input[0].length;
		int largest1=Integer.MIN_VALUE;
		int largest2=Integer.MIN_VALUE;
		int c1=0;
		int c2=0;
		for(int i=0;i<m;i++){
			int rsum=0;
			for(int j=0;j<n;j++){
				rsum=rsum+input[i][j];
			}
			if(rsum>largest1){
				largest1=rsum;
				c1=i;
			}
		}

		for(int j=0;j<n;j++){

			int colsum=0;
			for(int i=0;i<m;i++){
				colsum=colsum+input[i][j];
			}
			if(colsum>largest2){
				largest2=colsum;
				c2=j;
			}
		}

		if(largest1>=largest2){
			System.out.print("row "+c1+" "+largest1);
		}
		else
			System.out.print("column "+c2+" "+largest2);




	}

}
