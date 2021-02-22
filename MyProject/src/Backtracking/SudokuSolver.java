package Backtracking;

import java.util.Scanner;

public class SudokuSolver {

	public static boolean Sudoku(int board[][]) {
		int row=-1;
		int col=-1;
		boolean flag=false;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]==0) {
					row=i;
					col=j;
					flag=true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}

		if(row==-1) {
			return true;
		}

		for(int k=1;k<=9;k++) {
			if(isPossible(board,row,col,k)) {
				board[row][col]=k;
				if(Sudoku(board)) {
					return true;
				}
				board[row][col]=0;
			}
		}
		return false;
	}

	public static boolean isPossible(int board[][],int row, int col,int k) {
		if(presentInRow(board,row,k)) {
			return false;
		}
		if(presentInCol(board,col,k)) {
			return false;
		}
		if(presentInBox(board,row-row%3,col-col%3,k)) {
			return false;
		}


		return true;
	}


	public static boolean presentInRow(int board[][],int row,int k) {
		for(int j=0;j<9;j++) {
			if(board[row][j]==k) {
				return true;
			}
		}
		return false;
	}

	public static boolean presentInCol(int board[][], int col,int k) {
		for(int i=0;i<9;i++) {
			if(board[i][col]==k) {
				return true;
			}
		}
		return false;
	}

	public static boolean presentInBox(int board[][],int row, int col,int k) {
		for(int i=row;i<row+3;i++) {
			for(int j=col;j<col+3;j++) {
				if(board[i][col]==k) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int board[][]=new int[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				board[i][j]=o.nextInt();
			}
		}

		System.out.println(Sudoku(board));

	}

}
