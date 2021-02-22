package Backtracking;
import java.util.*;


public class AllPathRatMaze {

	public static void printRatInMaze(int mat[][]) {
		int m=mat.length;
		int n=mat[0].length;
		int [][] path=new int[m][n];
		printAllPath(mat,0,0,path);
	}

	private static void printAllPath(int[][] mat, int i, int j, int[][] path) {
		// TODO Auto-generated method stub
		int m=mat.length;
		int n=mat[0].length;

		if(i<0|| i>=m || j<0 || j>=n || mat[i][j]==0 || path[i][j]==1) {
			return;
		}

		path[i][j]=1;
		if(i==m-1 && j==n-1) {
			for(int r=0;r<m;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c]+" ");
				}
			}
			System.out.println();
			path[i][j]=0;
			return;

		}

		printAllPath(mat,i-1,j,path);
		printAllPath(mat,i,j+1,path);
		printAllPath(mat,i+1,j,path);
		printAllPath(mat,i,j-1,path);
		path[i][j]=0;
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
		printRatInMaze(mat);

	}

}
