package Graph__;

import java.util.*;

public class BFSAdjacencyMatrix {

	public static void printHelper(int edges[][],int sv, boolean visited[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(sv);
        visited[sv]=true;
        while(!q.isEmpty()){
            int front=q.remove();
            System.out.print(front+" ");
            int n=edges.length;
            for(int i=0;i<n;i++) {
                if(edges[front][i]==1 && !visited[i]) {
                    q.add(i);
                    visited[i]=true;
                }
            }
             
            
        }

    }

    public static void print(int edges[][]){
        boolean visited[]=new boolean[edges.length];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                printHelper(edges,i,visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][]=new int [V][V];
        for(int i=0;i<E;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }

        print(edges);
    }
}

