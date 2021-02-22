package Arrays_and_string;

public class LeadersInArray {

public static void leaders(int[] input) {
		  
        
        int n=input.length;
        int r_m=input[n-1];
        int a[] = new int[n];
        int count=0;
        
        for(int i=n-2;i>=0;i--){
           
            if(r_m<=input[i]){
                r_m=input[i];
                a[count]=r_m;
                count++;
                //System.out.print(r_m+" ");
            }
        }
		
        for(int i=count-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        
        System.out.print(input[n-1]+" ");
	}
}

/*
  Sample Input 1 :
6
3 12 34 2 0 -1
Sample Output 1 :
34 2 0 -1
Sample Input 2 :
5
13 17 5 4 6
Sample Output 2 :
17 6
 
  */
