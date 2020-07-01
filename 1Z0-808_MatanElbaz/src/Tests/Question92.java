package Tests;

public class Question92 {

	public static void main(String[] args) {
		String names[] = { "Thomas", "Peter", "Joseph" };// They were wrong here and made compilation errors because an
															// array cannot be initialized with "()" but with "{}" it
															// will of course work.
		String pwd[] = new String[3];
		int idx = 0;
		try {
			for (String n : names) {
				pwd[idx] = n.substring(2,6);
				idx++;
				}
		} catch (Exception e) {
			System.out.println("Invalid Name");
		}
		for (String p : pwd) {
			System.out.println(p);
		}
	}
	//Correct Answer: C

}
