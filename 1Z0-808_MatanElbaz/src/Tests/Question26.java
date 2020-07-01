package Tests;

import java.util.ArrayList;
import java.util.List;

public class Question26 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");

		if (names.remove("Bran")) { // Just remove the value , it doesn't return T or F ..
			names.remove("Jon"); // never get here..
		}
		System.out.println(names);
	}
}
