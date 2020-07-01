package Tests;

import java.util.ArrayList;
import java.util.List;

class Patient {
	String name;

	public Patient(String name) {
		this.name = name;
	}
}

public class Question89 {

	public static void main(String[] args) {
		List ps = new ArrayList();
		Patient p2 = new Patient("Mike");
		ps.add(p2);
		
		int f = ps.indexOf(p2);
		
		if (f >= 0 ) {
			System.out.println("Mike found");
			
		}
	}
//Correct Answer: A
}
