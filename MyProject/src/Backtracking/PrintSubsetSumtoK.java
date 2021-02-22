package Backtracking;

public class PrintSubsetSumtoK {
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
        int out[]=new int[0];
        printSubsetsSumTok(input,0,out,k);
        
        		
	}
    public static void printSubsetsSumTok(int input[], int si,int[] output,int k) {
    	if(si==input.length){
            if(k==0){
            for(int i=0;i<output.length;i++){
                System.out.print(output[i]+" ");
                
            }
            System.out.println();
                return;
            }
            else{
                return;
            }
        }
        int start=input[si];
        int nout[]=new int[output.length+1];
        // nout[0]=start;
        int x=0;
        for(int i=0;i<output.length;i++){
            nout[x++]=output[i];
        }
        nout[x]=start;
        printSubsetsSumTok(input,si+1,nout,k-start);
        
        printSubsetsSumTok(input,si+1,output,k);
        
    }
}
