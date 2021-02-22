package Ninja;


public class RatMaze {
	

		public static boolean ratInAMaze(int maze[][]){
	        int m=maze.length;
	        int n=maze[0].length;
	        int path[][]=new int[m][n];
	        
	       return SolveMaze(maze,0,0,path);
	        
	        
		}
	    public static boolean SolveMaze(int maze[][],int i,int j,int path[][]){
	        int m=maze.length;
	        int n=maze[0].length;
	        
	        if(i<0 || i>=m || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1 ){
	            return false;
	        }
	        
	        
	        path[i][j]=1;
	        if(i==m-1 && j==n-1){
	        	//System.out.println(i+" "+j);
	        	for(int x=0;x<m;x++) {
		        	for(int y=0;y<n;y++) {
		        		 {
		        			System.out.print(path[x][y]+" ");
		        		}
		        		 
		        	}
		        	System.out.println();
		        }
		        
	            return true;
	        }
	        
	        if(SolveMaze(maze,i-1,j,path)){
	        	//System.out.println(i+" "+j);
	            return true;
	        }
	        if(SolveMaze(maze,i,j+1,path)){
	        	//System.out.println(i+" "+j);
	            return true;
	        }
	        if(SolveMaze(maze,i+1,j,path)){
	        	//System.out.println(i+" "+j);
	            return true;
	        }
	        if(SolveMaze(maze,i,j-1,path)){
	        	//System.out.println(i+" "+j);
	            return true;
	        }
	        
	        return false;
	        
	        
	        
	        
	    }
	
	public static void main(String[] args) {
		
		int maze[][] = {{1,1,0},{1,1,0},{1,1,1}};
		boolean pathPossible =ratInAMaze(maze);
		System.out.println(pathPossible);	
	}
	

}
