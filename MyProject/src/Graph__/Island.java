package Graph__;

import java.util.*;

/*Sample Input :
2 1
1
2
Sample Output :
1 
*/

public class Island {
	public static int solve(int n,int m,int U[],int V[]) {
        //write your code here
        int edges[][]=new int [n][n];
        for(int i=0;i<m;i++){
            int fv=U[i]-1;
            int sv=V[i]-1;
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        return countIsland(edges,n);
    }


    public static int countIsland(int edges[][], int n){
        boolean visited[]=new boolean [edges.length];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                checkIsland(edges,i,visited);
                count++;
            }
        }
        return count;
    }

    public static void checkIsland(int edges[][],int sv, boolean visited[]){
        visited[sv]=true;
        int m=edges.length;
        for(int i=0;i<m;i++){
            if(edges[sv][i]==1 && !visited[i]){
                checkIsland(edges,i,visited);
                //return;
            }
        }
    }
    
    public static int[]u=new int [5005];
	public static int[]v=new int [5005];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		for(int i=0;i<m;i++)
		{
			u[i]=scan.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			v[i]=scan.nextInt();
		}
		System.out.println(solve(n,m,u,v));
	}
}