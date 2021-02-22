package Graph__;
import java.util.*;

public class Graph {

	public static void printHelper(int edges[][],int sv,boolean visited[]) {
		System.out.println(sv);
		visited[sv]=true;
		int n=edges.length;
		for(int i=0;i<n;i++) {
			if(edges[sv][i]==1 && !visited[i]) {
				printHelper(edges,i,visited);
			}
		}
	}

	public static void print (int edges[][]) {
		boolean visited[]=new boolean[edges.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				printHelper(edges,i,visited);
			}
		}
	}


	public static void main(String args[]) {
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int e=o.nextInt();
		int edges[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int fv=o.nextInt();
			int sv=o.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		print(edges);

	}
}
