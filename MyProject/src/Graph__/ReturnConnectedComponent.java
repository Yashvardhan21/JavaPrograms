package Graph__;
import java.util.*;

/*Sample Input 1:
4 2
0 1
2 3
Sample Output 1:
0 1 
2 3 
Sample Input 2:
4 3
0 1
1 3 
0 3
Sample Output 2:
0 1 3 
2
*/

public class ReturnConnectedComponent {

    static ArrayList<Integer> list;
    public static ArrayList<Integer> AllConnected(int edges[][], int sv, boolean visited[] ){
        list.add(sv);
        visited[sv]=true;
        int n=edges.length;
        for(int i=0;i<n;i++){
            if(edges[sv][i]==1 && !visited[i]){
                AllConnected(edges,i,visited);
            }
        }
        return list;
    }
    
    public static void AllConnected(int edges[][]){
    	boolean visited[]=new boolean[edges.length];
        ArrayList<Integer> output=new ArrayList<Integer>();
        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                list=new ArrayList<Integer>();
                output=AllConnected(edges,i,visited);
                Collections.sort(output);
                for(int j=0;j<output.size();j++){
                    System.out.print(output.get(j)+" ");
                }
                System.out.println();
            }
        }
    }
    
	 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][]=new int[V][V];
        for(int i=0;i<E;i++) {
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        AllConnected(edges);
    }
}