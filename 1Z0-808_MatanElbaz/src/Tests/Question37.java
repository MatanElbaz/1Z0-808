package Tests;

public class Question37 {

	public static void main(String[] args) {
		Question37 ts = new Question37();
		System.err.println(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = false;

}
