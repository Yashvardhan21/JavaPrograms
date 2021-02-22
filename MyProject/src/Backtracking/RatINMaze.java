package Backtracking;

import java.util.*;

public class RatINMaze {

	public static boolean RatInMaze(int mat[][]) {
		int m=mat.length;
		int n=mat[0].length;
		int [][] path=new int[m][n];
		return RatInMaze(mat,0,0,path);
	}
	
	private static boolean RatInMaze(int[][] mat, int i, int j, int[][] path) {
		// TODO Auto-generated method stub
		int m=mat.length;
		int n=mat[0].length;
		
		if(i<0|| i>=m || j<0 || j>=n || mat[i][j]==0 || path[i][j]==1) {
			return false;
		}
		
		path[i][j]=1;
		if(i==m-1 && j==n-1) {
			return true;
		}
		
		if(RatInMaze(mat,i-1,j,path)) {
			return true;
		}
		if(RatInMaze(mat,i,j+1,path)) {
			return true;
		}
		if(RatInMaze(mat,i+1,j,path)) {
			return true;
		}
		if(RatInMaze(mat,i,j-1,path)) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int mat[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=o.nextInt();
			}
		}
		System.out.println(RatInMaze(mat));

	}

}
