package Arrays_and_string;

public class count_platforms {
	public static int platformsNeeded(int[] arrival,int[] departure){
		/* Don't write main().
	     * Don't read input, it is passed as function argument.
	     * Return the answer.
	     * Taking input and printing output is handled automatically.
	     */
        int n1=arrival.length;
        int n2=departure.length;
        int count=1;
        int res=1;
       
       
        for(int i=1;i<n1;i++){
            int key=arrival[i];
            int j=i-1;
            
            while(j>=0 && arrival[j]>key){
                arrival[j+1]=arrival[j];
                j--;
            }
            arrival[j+1]=key;
        }
        
         for(int i=1;i<n2;i++){
            int key=departure[i];
            int j=i-1;
            
            while(j>=0 && departure[j]>key){
               departure[j+1]=departure[j];
                j--;
            }
            departure[j+1]=key;
        }
        
         int i=1;
        int j=0;
        
        while(i<n1 && j<n1){
            if(arrival[i]<=departure[j]){
                count++;
                i++;
                
                if(count>res){
                    res=count;
                }
            
            }
            else{
                count--;
                j++;
            }
                
        }
        return res;
       
	}

}

/*
Sample Input 1 :
6
900 940 950 1100 1500 1800
910 1200 1120 1130 1900 2000
Sample Output 1 :
3
Sample Input 2 :
4
1100 1101 1103 1105
1110 1102 1104 1106
Sample Output 2 :
2
*/