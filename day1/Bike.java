
package week1.day1;

class Car {
	
	public void applyBreak() {
		System.out.println("Applied break");
	}
	public void soundHorn() {
	System.out.println("Sound horn");
}
}

public class Bike {
	
	public static void main(String[] args) {
		Car cr = new Car();
		cr.applyBreak();
		cr.soundHorn();
		// TODO Auto-generated method stub

	}
}