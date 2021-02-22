package Arrays_and_string;

public class BreakWords {

	public static String breakWords(String str){
		 int n=str.length();
	        String a[]=str.split(" ");
	        String res="";
	        String temp="";
	        int n1=a.length;
	        for(int i=0;i<n1;i++){
	            temp="";
	            int l=a[i].length();
	            if(((l%2)==0) && (l>=4)){
	                temp+=a[i]+" ";
	                res+=temp.substring(0,l/2)+" "+temp.substring(l/2,l)+" ";
	            }
	            else
	                res+=a[i]+" ";
	        }
	        return res.substring(0,res.length()-1);

		}
}
/*
 Sample Input :
Helloo world good morniing
Sample Output :
Hel loo world go od morn iing
*/

