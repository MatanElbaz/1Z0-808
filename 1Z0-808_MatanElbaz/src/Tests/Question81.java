package Tests;

public class Question81 {
	int x;
	int y;
	public void doStuff(int x ,int y) {
		this.x = x;
		y = this.y;
	}
	public void display() {
		System.out.println(x + " " + y +": ");
	}
	public static void main(String[] args) {
		Question81 m1 = new Question81();
		m1.x = 100;
		m1.y = 200;
		Question81 m2 = new Question81();
		m2.doStuff(m1.x , m1.y);
		m1.display();
		m2.display();
	}//Correct Answer: D

}
