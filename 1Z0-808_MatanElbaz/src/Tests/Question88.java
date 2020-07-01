package Tests;

public class Question88 {
	public static void main(String[] args) {
		String stuff = "TV";
		String res = null;

		res = stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "Wite" : "No Result";

			System.err.println(res);
	}
}
//Correct Answer: D