package Arrays_and_string;

public class wave_and_spiral_print {

	
	//wave
	
public static void wavePrint(int input[][]){
		
		// Write your code here
        int m=input.length;
        int n=input[0].length;
        for(int j=0;j<n;j++){
            if(j%2==0){
                for(int i=0;i<m;i++){
                    System.out.print(input[i][j]+" ");
                }
            }
            else{
                 for(int i=m-1;i>=0;i--){
                    System.out.print(input[i][j]+" ");
                }
            }
        }
	}

/*Sample Input 1:
1
3 4 
1  2  3  4 
5  6  7  8 
9 10 11 12
Sample Output 1:
1 5 9 10 6 2 3 7 11 12 8 4
Sample Input 2:
2
5 3 
1 2 3 
4 5 6 
7 8 9 
10 11 12 
13 14 15
3 3
10 20 30 
40 50 60
70 80 90
Sample Output 2:
1 4 7 10 13 14 11 8 5 2 3 6 9 12 15 
10 40 70 80 50 20 30 60 90 */

	// spiral


public static void spiralPrint(int matrix[][]){
	// Write your code here
    int m=matrix.length;
    int n=matrix[0].length;
    int rs=0;
    int re=m;
    int cs=0;
    int ce=n;
  
    while(rs<re && cs<ce){
        for(int i=cs;i<ce;i++)
        {
            System.out.print(matrix[rs][i]+" ");
              
        }
        rs++;
        
        for(int i=rs;i<re;i++){
            System.out.print(matrix[i][ce-1]+" ");
        }
        ce--;
        
        // if (rs < re) {
        for(int i=ce-1;i>=cs;i--){
            System.out.print(matrix[re-1][i]+" ");
        }
        re--;
        // }
        
        // if(cs<ce){
        for(int i=re-1;i>=rs;i--){
            System.out.print(matrix[i][cs]+" ");
        }
        cs++;
        // }
    }

}

/*Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Sample Input 2:
2
3 3 
1 2 3 
4 5 6 
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5 
10 20 30 */


	
}
