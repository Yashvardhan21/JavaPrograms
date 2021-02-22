package Backtracking;

public class PrintSubsetsofArray {
	public static void printSubsets(int input[]) {
		// Write your code here
        int OutputSoFar[]=new int [0];
       	printSubsets(input,0,OutputSoFar);

	}
    public static void printSubsets(int input[],int si,int OutputSoFar[]) {
        if(si==input.length){
            for(int i=0;i<OutputSoFar.length;i++)
            {
                System.out.print(OutputSoFar[i]+" ");
            }
            System.out.println();
			return;
        }
        
        //int start=input[si];
        printSubsets(input,si+1,OutputSoFar);
        int Output[]=new int[OutputSoFar.length+1];
        int k=0;
        for(int i=0;i<OutputSoFar.length;i++){
            Output[k++]=OutputSoFar[i];
            
        }
        
        Output[k]=input[si];
        printSubsets(input,si+1,Output);
        
    }
}
