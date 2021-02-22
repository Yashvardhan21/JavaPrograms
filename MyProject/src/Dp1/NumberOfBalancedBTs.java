package Dp1;

public class NumberOfBalancedBTs {
	static int mod=(int)Math.pow(10,9)+7;
    public static int balancedTreesOfHeightH1(int h){
     	int storage[]=new int[h+1];
        for(int i=0;i<=h;i++){
            storage[i]=-1;
        }
        return balancedTreesOfHeightH(h,storage);
    }
    
     public static int balancedTreesOfHeightH(int h,int storage[]){
         if(h==0||h==1){
             storage[h]=1;
             return storage[h];
         }
         
         if(storage[h]!=-1){
             return storage[h];
         }
         
         int a = balancedTreesOfHeightH(h-1,storage);
         int b = balancedTreesOfHeightH(h-2,storage);
         long value1=((long)a*a)%mod;
         long value2=(2*(long)a*b)%mod;
         int res1=(int)value1;
         int res2=(int)value2;
         storage[h]=(int)(res1+res2)%mod;
         return storage[h];
     }
     
     
     //using dp
     
//     static int mod=(int)Math.pow(10,9)+7;
     public static int balancedTreesOfHeightH(int h){
         // Write your code here
         int arr[]=new int[h+1];
         for(int i=0;i<=h;i++)
         {
             arr[i]=-1;
         }
         return balancedTreesOfHeightHdp(h,arr);


     }



     public static int balancedTreesOfHeightHdp(int h,int storage[])
     {
         storage[0]=1;
         storage[1]=1;
         for(int i=2;i<=h;i++)
         {
             int a=storage[i-1];
             int b=storage[i-2];
             long value1=((long)a*a)%mod;
             long value2=(2*(long)a*b)%mod;
             int res1=(int)value1;
             int res2=(int)value2;
             storage[i]=(res1+res2)%mod;;
         }
         return storage[h];
     }
}
