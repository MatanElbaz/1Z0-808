package Tests;

public class Question10 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String string = "";

		if (sb.equals(string)) {
			System.out.println("Match 1 ");

		} else if (sb.toString().equals(sb.toString())) {
			System.out.println("Match 2");// <<<<current !

		} else {
			System.out.println("No Match ");
		}
	}

}
