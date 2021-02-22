package myproject;

public class FractionUse {

	public static void main(String[] args){

		Fraction f1=new Fraction (20,30);
		f1.print();

		f1.SetNumerator(12);
		int d=f1.getdenominator();
		System.out.println(d);
		f1.print();

		f1.SetNumerator(10);
		try {
			f1.Setdenominator(0);
		}
		catch(ZeroDenominatorException e){
			System.out.println("Don,t set denominator 0");
		}
		
		f1.print();

		Fraction f2=new Fraction (3,4);
		f1.add(f2);
		f1.print();
		f2.print();

		Fraction f3=new Fraction (4,5);
		f3.Multiply(f2);
		f3.print();
		f2.print();

		Fraction f4= Fraction.add(f1,f2);
		f1.print();
		f2.print();
		f4.print();
	}

}
