package Maths;

public class GCD {

	public static int gcd(int A, int B) {
        int max=Integer.MIN_VALUE;
        if(A==0){
            return B;
        }
        else if(B==0){
            return A;
        }
        else if(A<B){
            for(int i=1;i<=A;i++){
                if(A%i==0 && B%i==0){
                    max=Math.max(max,i);
                }
            }
        }
        else{
            for(int i=1;i<=B;i++){
                if(A%i==0 && B%i==0){
                    max=Math.max(max,i);
                }
            }
        }
        
        return max;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(6,9));
	}

}
