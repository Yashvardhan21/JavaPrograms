package Ninja;
import java.util.Scanner;

public class PrintRatMaze {
	
	public static void ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 
        int m=maze.length;
        int n=maze[0].length;
        int path[][]=new int[m][n];
        
        printMaze(maze,0,0,path);
        
        
	}
    public static void printMaze(int maze[][],int i,int j,int path[][]){
        int m=maze.length;
        int n=maze[0].length;

        if(i<0 || i>=m || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1 ){
            return;
        }

        path[i][j]=1;
        if(i==m-1 && j==n-1){
            for(int x=0;x<m;x++){
                for(int y=0;y<n;y++){
                    System.out.print(path[x][y]+" ");
                }
                
            }
            System.out.println();
            path[i][j]=0;
            return;

        }

        printMaze(maze,i-1,j,path);
        printMaze(maze,i,j+1,path);
        printMaze(maze,i+1,j,path);
    	printMaze(maze,i,j-1,path);
        path[i][j]=0;



        }

    


    	public static void main(String[] args) {
    		Scanner s = new Scanner(System.in);
    		int n = s.nextInt();
    		int maze[][] = new int[n][n];
    		for(int i = 0; i < n; i++){
    			for(int j = 0; j < n; j++){
    				maze[i][j] = s.nextInt();
    			}
    		}
    		ratInAMaze(maze);	
    	}

    }






