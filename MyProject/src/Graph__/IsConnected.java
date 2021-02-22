package Graph__;

import java.util.*;
/*
 Sample Input 1:
4 4
0 1
0 3
1 2
2 3
Sample Output 1:
true
Sample Input 2:
4 3
0 1
1 3 
0 3
Sample Output 2:
false 
Sample Output 2 Explanation
The graph is not connected, 
even though vertices 0,1 and 3 are connected to each other 
but there isn’t any path from vertices 0,1,3 to vertex 2.  

 */
public class IsConnected {
	public static void check(int edges[][],int sv,boolean visited[]){
		visited[sv]=true;
		int n=edges.length;
		for(int i=0;i<n;i++){
			if(edges[sv][i]==1 && !visited[i]){
				check(edges,i,visited);
			}
		}

	}

	public static boolean IsConnected(int[][] edges){

		int n=edges.length;
		boolean visited[]=new boolean[n];
		int j=0;
		for(int i=0;i<n;i++){
			if(!visited[i]){
				if(j>=1){
					return false;
				}
				check(edges,i,visited);
				j++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int edges[][]=new int[V][V];
		for(int i=0;i<E;i++){
			int fv=s.nextInt();
			int sv=s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}

		System.out.println(IsConnected(edges));
	}
}