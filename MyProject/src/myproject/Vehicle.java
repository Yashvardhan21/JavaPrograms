package myproject;

public abstract class Vehicle {
	String color;
	private int maxspeed;
	
	public abstract boolean isMotorized();
	
	public abstract String getCompany();
	
	public Vehicle() {
		System.out.println("Vehicle Constructor");
	}
	
	public Vehicle(int maxspeed) {
		this.maxspeed=maxspeed;
		System.out.println("Vehicle Constructor");
	}
	public void setmaxspeed(int speed) {
		maxspeed=speed;
	}
	
	public int getmaxspeed() {
		return maxspeed;
	}
	
	public void print() {
		System.out.println("Vehicle color :"+color);
		System.out.println("Vehicle Maxspeed :"+maxspeed);
	}
}
