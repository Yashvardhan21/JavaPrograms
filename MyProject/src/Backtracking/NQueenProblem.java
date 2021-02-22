package Backtracking;

import java.util.Scanner;

public class NQueenProblem {
	
	public static boolean issafe(int board[][],int row,int col) {
		
		int i,j;
		int n=board.length;
		
		for( i=0;i<row;i++) {
			if(board[i][col]==1) {
				return false;
			}
		}
		
		for(i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(board[i][j]==1) {
				return false;
			}
		}
		
		for(i=row,j=col;i>=0 && j<n;i--,j++) {
			if(board[i][j]==1) {
				return false;
			}
		}
		return true;
	}

	public static void NQueen(int n) {
		int board[][]=new int [n][n];
		NQueen(board,0,n);
		
	}
	
	public static void NQueen(int board[][],int i,int n) {
		if(i==n) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(board[r][c]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		for(int j=0;j<n;j++) {
			if(issafe(board,i,j)) {
				board[i][j]=1;
				NQueen(board,i+1,n);
				board[i][j]=0;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int m=o.nextInt();
		NQueen(m);

	}

}
