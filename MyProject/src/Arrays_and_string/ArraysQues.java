package Arrays_and_string;

public class ArraysQues {
	//Array Sum
	public static int sum(int[] input){

		int sum=0;
		int n=input.length;
		for(int i=0;i<n;i++)
		{
			sum=sum+input[i];
		}
		return sum;


	}

	//Linear Search
	
	public static int linearSearch(int[] arr, int num){
		int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==num)
                return i;
        }
            return -1;
	}
	
	//Arrange Numbers in Array
	
	public static int[] arrange(int n){
		
		
        int a[]=new int[n];
        int val=1;
        for(int i=0;i<=(n-1)/2;i++){
            a[i]=val;
            val=val+2;   
        }
        val=n;
        for(int i=((n-1)/2)+1;i<n;i++){
            if(n%2==0){
                a[i]=val;
                val=val-2;
            }
            else{
                a[i]=val-1;
                val=val-2;
            }
        }
        return a;

	}
	
	
	//swap alternate
	
	public static void swapAlternate(int[] input){
		
        int n=input.length;
        int a[]=new int[n];
        for(int i=0;i<n-1;i++){
            a[i]=input[i];
            input[i]=input[i+1];
            input[i+1]=a[i];
            i++;
        }
        
	}
	
	
}
