package Tests;
class Caller{

	private void init() {
		System.out.println("Initialized");
	}
	private void start() {
		init();
		System.err.println("Started");
	}
}
	public class Question79 {
	public static void main(String[] args) {
		Caller c - new Caller();//compilation fails.' - '
		c.start();//compilation fails , private method.
		c.init(); //compilation fails , private method.
	}
//Correct Answer: D
}
