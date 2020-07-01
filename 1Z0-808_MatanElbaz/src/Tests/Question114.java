package Tests;

public class Question114 {
	public static final int MIN = 1;

	public static void main(String[] args) {
		int x = args.length;

		if (checkLimit(x)) {
			System.out.println("Java SE");

		} else {
			System.err.println("Java EE");
		}
	}

	private static boolean checkLimit(int x) {
		return (x >= MIN) ? true : false;
	}
//Correct Answer: B
}
