package Maths;

import java.util.Scanner;

public class BinaryToAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String s=o.nextLine();
		int decimal=Integer.parseInt(s,2);
//		String octal=Integer.toOctalString(decimal);
		String octal=Integer.toString(decimal,8);
//		String hex=Integer.toHexString(decimal);
		String hex=Integer.toString(decimal,16);
		
		System.out.println("decimal no:" +decimal);
		System.out.println("Octal no:" +octal);
		System.out.println("Hexa-decimal no:" +hex);


	}

}
