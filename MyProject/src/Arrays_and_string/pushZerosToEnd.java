package Arrays_and_string;

public class pushZerosToEnd {

public static void pushZerosAtEnd(int[] arr){
		
        int n=arr.length;
        int i=0;
        int k=0;
        int temp=0;
      
       while(i<n-1 && k<n-1){
           
           if(arr[i]==0 && arr[k]==0){
               i++;
               if(arr[i]!=0){
               arr[k]=arr[i];
               arr[i]=0;
                  k++; 
               }
               
           }
            
           else {
                i++;
                k++;
            }
        
        
       }
	}
}

/*
Sample Input 2:
2
5
0 3 0 2 0
4
9 0 0 8 2
Sample Output 2:
3 2 0 0 0
9 8 2 0 0 
*/
