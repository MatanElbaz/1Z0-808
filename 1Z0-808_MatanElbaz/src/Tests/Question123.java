package Tests;

import java.time.LocalDate;

public class Question123 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012, 01, 32);
		date.plusDays(10);
		System.out.println(date);
		//Correct Answer: D
	}

}
