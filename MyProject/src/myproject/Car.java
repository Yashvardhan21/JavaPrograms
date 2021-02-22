package myproject;

public abstract class Car extends Vehicle {
	int gear;
	boolean isConvertible;
	
	public Car(){
		super(800);
	}
	
	@Override
	public boolean isMotorized() {
		return false;
	}
	
	
	
	public Car(int gear, int maxspeed) {
		super(maxspeed);
		this.gear=gear;
		System.out.println("Car constructor");
	}
	
	
	public void print() {
//		System.out.println("Car color :"+color);
//		System.out.println("Car Maxspeed :"+getmaxspeed());
		super.print();
		System.out.println("Car gear :"+gear);
		System.out.println("Car isConvertible:"+isConvertible);
	}
}
