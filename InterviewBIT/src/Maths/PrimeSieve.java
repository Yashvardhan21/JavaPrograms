package Maths;
import java.util.ArrayList;
import java.util.Scanner;
public class PrimeSieve {

	public static int[] sieve(int A) {
		boolean isPrime[]=new boolean[A+1];
		ArrayList<Integer> list=new ArrayList<>();
		boolean check[]=sieveHelper(A,isPrime);

		for(int i=0;i<check.length;i++){
			if(isPrime[i]==true){
				list.add(i);
			}
		}

		int ans[]=new int[list.size()];
		for(int i=0;i<list.size();i++){
			ans[i]=list.get(i);
		}

		return ans;
	}

	public static boolean[] sieveHelper(int A, boolean isPrime[]){

		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i<=A;i++){
			isPrime[i]=true;
		}

		for(int i=2;i*i<=A;i++){
			if(isPrime[i]==true){
				// list.add(i);
				for(int k=i*i;k<=A;k+=i){
					isPrime[k]=false; 
				}
			}

		}


		return isPrime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int ans[]=sieve(n);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}


