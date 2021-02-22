package Maths;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		int num=o.nextInt();
		String binary="";
		while(num!=0) {
			binary+=num%2;
			num=num/2;
		}
		
		StringBuilder sb=new StringBuilder(binary);
		sb=sb.reverse();
		System.out.println("Binary no:" +sb.toString());

	}

}
