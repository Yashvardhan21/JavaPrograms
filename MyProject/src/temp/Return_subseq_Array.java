package temp;
import java.util.*;

public class Return_subseq_Array {
	public static int[][] subsets(int input[]) {
        return subsets(input,0);
    }
    
    public static int[][] subsets(int input[],int si){     
        if(si==input.length){
            int Output[][] = new int[1][0];
            return Output;
        }
        
        int smallOutput[][]=subsets(input,si+1);
        
        int Output[][]=new int[2*smallOutput.length][];
        int k=0;
        for(int i=0;i<smallOutput.length;i++){
            Output[k]=new int[smallOutput[i].length];
            for(int j=0;j<smallOutput[i].length;j++){
                Output[k][j]=smallOutput[i][j];
            }
            k++;
        }
        
        for(int i=0;i<smallOutput.length;i++){
            Output[k]=new int [smallOutput[i].length+1];
            Output[k][0]=input[si];
            for(int j=0;j<smallOutput[i].length;j++){
                Output[k][j+1]=smallOutput[i][j];
            }
            k++;
        }
        
        return Output;
        
        
    }


public static int[] takeInput() {
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	int arr[] = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = s.nextInt();
	}
	return arr;
}

public static void main(String[] args) {
	int[] input = takeInput();
	int output[][] = subsets(input);
	for(int i = 0; i < output.length; i++) {
		for(int j = 0; j < output[i].length; j++) {
			System.out.print(output[i][j] + " ");
		}
		System.out.println();
	}
}


}
