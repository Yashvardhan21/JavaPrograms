package Graph__;

import java.util.*;

public class HasPath {

/*
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
true
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
false
 */

    public static boolean hasPathHelper(int edges[][],int s1,int s2,boolean visited[]){
        int n=edges.length;
        boolean flag=false;
        visited[s1]=true;
        for(int i=0;i<n;i++){
            if(edges[s1][i]==1 && !visited[i]){
                visited[i]=true;
                if(i==s2){
                    flag=true;
                    break;
                }

                else{
                    flag=hasPathHelper(edges,i,s2,visited);
                    if(flag){
                        break;
                    }
                }
            }

        }
        return flag;
        
    }

    public static boolean hasPath(int edges[][],int s1,int s2){
        boolean visited[]=new boolean[edges.length];
        // for(int i=0;i<edges.length;i++){
        if(!visited[s1]){
            return hasPathHelper(edges,s1,s2,visited);
        }
        return false;
        // }
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int V = o.nextInt();
        int E = o.nextInt();
        int edges[][]=new int[V][V];
        for(int i=0;i<E;i++){
            int fv=o.nextInt();
            int sv=o.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        int s1=o.nextInt();
        int s2=o.nextInt();
        System.out.print(hasPath(edges,s1,s2));
    }
}
