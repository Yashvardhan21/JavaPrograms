package myproject;

public class StudentUse {

	public static void main(String[] args) {
		Student s1=new Student("yash",5);
		Student s2=new Student("jash");
//		s1.name="yash";
//		s1.roll=1;
		//System.out.println(s1.name+" "+s1.getRoll());
		s1.print();
		s2.print();

	}

}
