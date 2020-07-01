package Tests;

import java.awt.CardLayout;

class Vehicle {
	String type = "4W";
	int maxSpeed = 100;

	Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
	
}

public class Question5 extends Vehicle {
	String trans;

	// If a constructor does not explicitly invoke a superclass constructor, the
	// Java compiler automatically inserts a call to the no-argument constructor of
	// the superclass.
	// If the super class does not have a no-argument constructor, you will get a
	// compile-time error.
	Question5(String trans) {
		this.trans = trans;
	}

	public Question5(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this(trans);
	}

	public static void main(String[] args) {
		Question5 c1 = new Question5("Auto");
		Question5 c2 = new Question5("4w", 150, "Manual");
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);

	}
}
