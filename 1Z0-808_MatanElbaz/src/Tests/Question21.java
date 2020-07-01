package Tests;

public class Question21 {

	public static void main(String[] args) {
		// We replace line 7 with String opt ="true", exept boolean opt = true;
		String opt = "true";
		switch (opt) {
			case "true":
				System.out.println("True");

				break;

			default:
				System.out.println("***");

		}
		System.out.println("Done");
	}

}
