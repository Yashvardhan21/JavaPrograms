package Graph__;
import java.util.*;

public class DFSAdjacencyList {

	public static void printHelper(ArrayList<ArrayList<Integer>> adjList,int sv,boolean visited[]) {
		System.out.println(sv);
		visited[sv]=true;
		for(int i:adjList.get(sv)) {	
			if(!visited[i]) {
				printHelper(adjList,i,visited);
			}
		}

	}

	public static void print (ArrayList<ArrayList<Integer>> adjList) {
		boolean visited[]=new boolean[adjList.size()];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				printHelper(adjList,i,visited);
			}
		}
	}

	public static void main(String args[]) {
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int e=o.nextInt();
		ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
		for(int i=0;i<n;i++) {
			adjList.add(new ArrayList<Integer>());
		}

		for(int i=0;i<e;i++) {
			int fv=o.nextInt();
			int sv=o.nextInt();
			adjList.get(fv).add(sv);
			adjList.get(sv).add(fv);
		}
		print(adjList);
	}
}
 