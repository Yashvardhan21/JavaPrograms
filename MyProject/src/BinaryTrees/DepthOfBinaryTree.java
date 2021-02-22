package BinaryTrees;

public class DepthOfBinaryTree {
	public static int depth(String str)
	{
		//Write your code here
        if(str.charAt(0)=='l' ){
            return 0;
        }
        
        return 1+Math.max(depth(str.substring(1)),depth(str.substring(2)));
        
	}	
}
