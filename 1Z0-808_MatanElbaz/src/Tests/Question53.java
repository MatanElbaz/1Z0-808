package Tests;

class Vehic {
	int x;

	Vehic() {
		this(10);
	}

	Vehic(int x) {
		this.x = x;
	}
}

public class Question53 extends Vehic {
	int y;

	Question53() {
		super();
		this(20);
		//Constructor call must be the first statement in a constructor
	}
	Question53(int y){
		this.y = y;
	}
	@Override
	public String toString() {
		return super.x + ":"+this.y;
	}
	public static void main(String[] args) {
		Vehic yVehic = new Question53();
		System.err.println(yVehic);
	}
}
//Correct Answer: D

