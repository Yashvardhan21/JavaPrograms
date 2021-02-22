package temp;

public class Subsequences {

	public static String[] findSubsequences(String str){
        if(str.length()==0){
            String ans[]={""};
            return ans;
        }
        
        String smallAns[]=findSubsequences(str.substring(1));
        String ans[]=new String[2*smallAns.length];
        for(int i=0;i<smallAns.length;i++){
            ans[i]=smallAns[i];
        }
        
        for(int i=0;i<smallAns.length;i++){
            ans[i+smallAns.length]=str.charAt(0)+smallAns[i];
        }
        
        return ans;
    } 
    
	public static void main(String[] args) {
	    String str="xyz";
	    String ans[]=findSubsequences(str);
	    for(int i=0;i<ans.length;i++){
	        System.out.println(ans[i]);
	    }

	}

}
//
//
//public static void printsubsequences(String str, String ans){
//    if(str.length()==0){
//        System.out.println(ans);
//        return;
//    }
//    
//    printsubsequences(str.substring(1),ans);
//    printsubsequences(str.substring(1),ans+str.charAt(0));
//}
//
//public static void printsubsequences(String str){
//    printsubsequences(str,"");
//}
//public static void main(String[] args) {
//	printsubsequences("xyz");
//}



