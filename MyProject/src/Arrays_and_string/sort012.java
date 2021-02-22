package Arrays_and_string;

public class sort012 {
	
	public static int[] sort012(int[] arr){
		/* Your class should be named PushZerosAtEnd 
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to return or print the output.
     		 * Taking input and printing output is handled automatically.
     		 */
        // int n=arr.length;
//         int nz=0;
//         int nt=0;
//         int n1=0;
//         for(int i=0;i<n-1;i++){
//            if(arr[i]==0){
//                nz++;
//            }
//             else if(arr[i]==1){
//                 n1++;
//             }
//             else
//                 nt++;
            
//         }
        
//         for(int i=0;i<nz;i++){
//             arr[i]=0;
//         }
//          for(int i=nz;i<n1;i++){
//             arr[i]=1;
//         }
//          for(int i=n1;i<nt;i++){
//             arr[i]=2;
//         }
        
        
//        return arr; 
        
        
        int n=arr.length;
        int nz=0;
        int i=0;
        int nt=n-1;
        int temp=0; 
        while(i<=nt){
            int c=i+1;
            if(arr[i]==1){
                
                i++;
            }
            else if(arr[i]==0 ){
                temp=arr[nz];
                arr[nz]=arr[i];
                arr[i]=temp;
                i++;
                nz++;
            }
            else if(arr[i]==2){
                temp=arr[i];
                arr[i]=arr[nt];
                arr[nt]=temp;
                nt--;
               
                
            
            }
                
        }
        return arr;
       
        
//         int n=arr.length;
//         for(int i=1;i<n;i++){
//             int key=arr[i];
//             int j=i-1;
            
//             while(j>=0 && arr[j]>key){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=key;
//         }
//         return arr;
	}

}
