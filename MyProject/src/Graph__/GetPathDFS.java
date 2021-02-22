package Graph__;

import java.util.*;

/*
 Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
3 0 1
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
  */

public class GetPathDFS {
	static ArrayList<Integer> list=new ArrayList<>();
    public static boolean pathExist(int[][] edges, int v1, int v2,boolean visited[]){
    	int n=edges.length;
        if(v1==v2){
            return true;
        }
        
        visited[v1]=true;
        for(int i=0;i<n;i++){
            if(edges[v1][i]==1 && !visited[i]){
                if(pathExist(edges,i,v2,visited)){
                    list.add(i);
                    return true;
                }
            }
        }
        
        return false;
        
    }
    
    public static void getDFS(int[][] edges, int v1, int v2){
        int n=edges.length;
        boolean visited[]=new boolean[n];
        if(!visited[v1]){
            if(pathExist(edges,v1,v2,visited)){
                list.add(v1);
                for(int i=0;i<list.size();i++){
                    System.out.print(list.get(i)+" ");
                }
            }
        }
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
        int v1=s.nextInt();
        int v2=s.nextInt();
        getDFS(edges,v1,v2);
        
	}
}
