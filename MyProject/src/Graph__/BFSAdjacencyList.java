package Graph__;
import java.util.*;

/*Sample Input 1:
4 4
0 1
0 3
1 2
2 3
Sample Output 1:
0 1 3 2
*/

public class BFSAdjacencyList {

	public static void printHelper(ArrayList<ArrayList<Integer>> adj,int sv, boolean visited[]){
        Queue<Integer> q=new LinkedList<>();

        visited[sv]=true;
        q.add(sv);
        while(!q.isEmpty()){
            int front=q.remove();
            System.out.print(front+" ");
            ArrayList<Integer>li=adj.get(front);
            for(int i=0;i<adj.size();i++)
            {
                if((li.contains(i))&&!visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }

    }

    public static void print(ArrayList<ArrayList<Integer>> adj){
        boolean visited[]=new boolean[adj.size()];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                printHelper(adj,i,visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<E;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            adj.get(fv).add(sv);
            adj.get(sv).add(fv);
        }

        print(adj);
    }
}
