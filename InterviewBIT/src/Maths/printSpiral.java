package Maths;

import java.util.Scanner;

public class printSpiral {

	public static void Spiral(int mat[][]) {
		int m=mat.length;
		if(m==0) {
			return;
		}
		int n=mat[0].length;
		
		int rs=0;
		int re=m;
		int cs=0;
		int ce=n;
//		int c=0;
		while(rs<re && cs <ce) {
			for(int i=rs;i<re;i++) {
				System.out.print((char)(64+mat[i][cs])+" ");
				
			}
			cs++;
	
			for(int i=cs;i<ce;i++) {
				System.out.print((char)(64+mat[re-1][i])+" ");
				
			}
			re--;

			for(int i=re-1;i>=rs;i--) {
				System.out.print((char)(64+mat[i][ce-1])+" ");
				
			}
			ce--;

			
			for(int i=ce-1;i>=cs;i--) {
				System.out.print((char)(64+mat[rs][i])+" ");
			
			}
			rs++;

		}
		
	}
	


    public static void spiralPrintAlpha(int matrix[][]){
        //Your code goes here
        int m=matrix.length;
        if(m==0){
            return;
        }
        int n=matrix[0].length;

        int rs=0;
        int re=m-1;
        int cs=0;
        int ce=n-1;
        
        char output[][]=new char[m][n];

        while(rs<=re && cs<=ce){
            for(int i=cs;i<=ce;i++){
                output[rs][i]=(char)(64+matrix[rs][i]);
               
            }
            rs++;

            for(int i=rs;i<=re;i++){
                output[i][ce]=(char)(64+matrix[i][ce]);
            }
            ce--;

            for(int i=ce;i>=cs;i--){
                output[re][i]=(char)(64+matrix[re][i]);
            }
            re--;

            for(int i=re;i>=rs;i--){
                output[i][cs]=(char)(matrix[i][cs]+64);
            }
            cs++;

        }

       
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }

    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int m=o.nextInt();
		int n=o.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=o.nextInt();
			}
		}
		
		Spiral(a);
		System.out.println();
		spiralPrintAlpha(a);

	}

}
