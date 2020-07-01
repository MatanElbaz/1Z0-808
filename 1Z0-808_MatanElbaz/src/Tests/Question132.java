package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question132 {

	public static void main(String[] args) {
		String[] arr = { "Hi", "How", "Are", "You" };// compilation fail they put ()
		List<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		if (arrList.removeIf((String s)->(return s.length()<=2;)) {
			System.out.println(s+"removed");
		}//Correct Answer: A
	}

}
