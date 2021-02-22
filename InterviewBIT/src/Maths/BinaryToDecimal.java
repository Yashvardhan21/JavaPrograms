package Maths;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String s=o.nextLine();
		int decimal=Integer.parseInt(s,2);
		System.out.println("decimal no:" +decimal);
	}

}
