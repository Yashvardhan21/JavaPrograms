package myproject;

public class Student {
	private int roll;
	String name;
	
	public Student(String name) {
		this.name=name;
		//this.roll=roll;
	}
	public Student(String name, int roll) {
		this.name=name;
		this.roll=roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		if(roll<=0) {
			return;
		}
		this.roll=roll;
	}
	
	public void print() {
		System.out.println(name+" "+roll);
	}

}
